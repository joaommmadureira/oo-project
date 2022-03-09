package negocio;

import java.util.Date;

public class Dados {

    private Anfitriao[] anfitrioes = new Anfitriao[5];
    private Usuario[] usuarios = new Usuario[5];
    private Localizacao[] localizacoes = new Localizacao[5];
    private Aluguel[] alugueis = new Aluguel[0];

    public Dados() {
        cadastrarUsuariosAleatorios();
        cadastrarAnfitrioesAleatorios();
    }

    // Cadstrando dados aleatórios de início e para testes

    public void cadastrarUsuariosAleatorios() {
        for (int i = 0; i < 5 ; i++) {

            String n = "Usuario" + i;
            int ddd = 110 + i;
            int num = 11111110 + i;
            long cpf = 11111111110L + i;
            long numCartao = 1111111111111110L + i;
            Date dtVencimento = new Date();
            int codSeguranca = Integer.parseInt("11" + 1);

            Usuario u = new Usuario(n, cpf, ddd, num, numCartao, codSeguranca, dtVencimento);

            this.usuarios[i] = u;
        }
    }

    public void cadastrarAnfitrioesAleatorios() {
        for (int i = 0; i < 5 ; i++) {

            String n = "Anfitriao" + i;
            int ddd = 110 + i;
            int numTel = 11111110 + i;
            long cpf = 11111111110L + i;
            long numCartao = 1111111111111110L + i;
            Date dtVencimento = new Date();
            int codSeguranca = Integer.parseInt("11" + 1);

            Anfitriao u = new Anfitriao(n, cpf, ddd, numTel, numCartao, codSeguranca, dtVencimento);

            this.anfitrioes[i] = u;
        }
    }

    public Anfitriao[] getAnfitrioes() {
        return this.anfitrioes;
    }

    public Anfitriao[] setAnfitrioes(Anfitriao[] anfitrioes) {
        return this.anfitrioes = anfitrioes;
    }

    public void addAnfitriao(Anfitriao novoAnfitriao) {
        // criando array novo para acomodar o novo anfitriao
        Anfitriao [] anfitrioesAtt = new Anfitriao[this.anfitrioes.length + 1];

        int j;

        // passando dados do array antigo para o atualizado
        for (j = 0; j < anfitrioes.length; j++ )
			this.anfitrioes[j] = anfitrioesAtt[j];

        anfitrioesAtt[j] = novoAnfitriao;
        
        this.setAnfitrioes(anfitrioesAtt);
    }

    public void deletarAnfitriao(Anfitriao anfitriaoDeletado) {
        Anfitriao [] anfitrioesAtt = new Anfitriao[this.anfitrioes.length - 1];

        // passando dados do array novo para o antigo exceto o elemento que queremos deletar
        for (int j = 0; j < anfitrioes.length; j++ )
            if(anfitrioes[j].equals(anfitriaoDeletado))
			    this.anfitrioes[j] = anfitrioesAtt[j];
        
        this.setAnfitrioes(anfitrioesAtt);
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public void addUsuario(Usuario novoUsuario) {
        Usuario [] usuariosAtt = new Usuario[this.usuarios.length + 1];

        int j;

        for (j = 0; j < usuarios.length; j++ )
			usuariosAtt[j] = this.usuarios[j];

        usuariosAtt[j] = novoUsuario;

        this.setUsuarios(usuariosAtt);
    }

    public Localizacao[] getLocalizacoes() {
        return this.localizacoes;
    }

    public void setLocalizacoes(Localizacao[] localizacoes) {
        this.localizacoes = localizacoes;
    }

    public void addLocalizacao(Localizacao novaLocalizacao) {
        Localizacao [] localizacoesAtt = new Localizacao[this.localizacoes.length + 1];

        int j;

        for (j = 0; j < localizacoes.length; j++ )
			this.localizacoes[j] = localizacoesAtt[j];

        localizacoesAtt[j] = novaLocalizacao;
        
        this.setLocalizacoes(localizacoesAtt);
    }

    public Aluguel[] getAlugueis() {
        return this.alugueis;
    }

    public void setAlugueis(Aluguel[] alugueis) {
        this.alugueis = alugueis;
    }

    public void addAluguel(Aluguel novoAluguel) {
        Aluguel [] alugueisAtt = new Aluguel[this.alugueis.length + 1];

        int j;

        for (j = 0; j < alugueis.length; j++ )
			this.alugueis[j] = alugueisAtt[j];

        alugueisAtt[j] = novoAluguel;
        
        this.setAlugueis(alugueisAtt);
    }
}
