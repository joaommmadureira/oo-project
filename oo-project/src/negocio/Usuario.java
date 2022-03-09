package negocio;

import java.util.Date;

public class Usuario extends Pessoa {

    private Localizacao[] locaisFavoritos = new Localizacao[0];
    private Hospedagem[] imoveisSalvos = new Hospedagem[0];
	
	public Usuario(String nome, long cpf, int ddd, int numTelefone, long numCartao, int codSeguranca, Date dtVencimento) {
		this.nome = nome;
		this.cpf = cpf;

		numTel = new Telefone(ddd, numTelefone);
		cartao = new Cartao(numCartao, codSeguranca, dtVencimento);
	}

    public void avaliarHospedagem(Hospedagem hospedagem, int nota) {
        hospedagem.setAvaliacao(nota);
    }

    public void avaliarAnfitriao(Anfitriao anfitriao, int nota) {
        anfitriao.setAvaliacao(nota);
    }
	
    public void adicionarLocalizacaoFavorita(Localizacao novoFavorito) {

        Localizacao [] novosFavoritos = new Localizacao[locaisFavoritos.length];

        int j;

        for (j = 0; j < locaisFavoritos.length; j++ )
			locaisFavoritos[j] = novosFavoritos[j];

        novosFavoritos[j] = novoFavorito;
        
        this.setLocaisFavoritos(novosFavoritos);
    }

    public void salvarHospedagem(Hospedagem novoSalvo) {

        Hospedagem [] novosSalvos = new Hospedagem[imoveisSalvos.length];

        int j;

        for (j = 0; j < imoveisSalvos.length; j++ )
			imoveisSalvos[j] = novosSalvos[j];

        novosSalvos[j] = novoSalvo;
        
        this.imoveisSalvos = novosSalvos;
    }

    public Localizacao[] getLocaisFavoritos() {
		return this.locaisFavoritos;
	}

    public void setLocaisFavoritos(Localizacao [] locaisFavoritos) {
		this.locaisFavoritos = locaisFavoritos;
	}

    public Hospedagem[] getImoveisSalvos(){
		return this.imoveisSalvos;
	}

    public void setImoveisSalvos(Hospedagem [] imoveisSalvos) {
		this.imoveisSalvos = imoveisSalvos;
	}

    public void cancelarAluguel(Aluguel aluguel) {
        aluguel.setCancelado(true);
    }
}

