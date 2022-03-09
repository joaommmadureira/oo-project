package negocio;

import java.util.Date;

public class Teste {
	public static void main(String[] args) {

        Dados dados = new Dados();

        // adicionar usuario

        String n = "Usuario Adicional";
        int ddd = 555;
        int num = 55555555;
        long cpf = 55555555555L;
        long numCartao = 5555555555555555L;
        Date dtVencimento = new Date();
        int codSeguranca = 555;

        Usuario u = new Usuario(n, cpf, ddd, num, numCartao, codSeguranca, dtVencimento);

        dados.addUsuario(u);

        // adicionarLocalizacaoFavorita();
	
		
	}
}
