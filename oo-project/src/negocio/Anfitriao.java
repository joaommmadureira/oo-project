package negocio;

import java.util.Date;

public class Anfitriao extends Pessoa{

    private Hospedagem[] hospedagens = new Hospedagem[0];
	private Avaliacao avaliacao;

	public Anfitriao(String nome, long cpf, int ddd, int numTelefone, long numCartao, int codSeguranca, Date dtVencimento) {
		this.nome = nome;
		this.cpf = cpf;

		numTel = new Telefone(ddd, numTelefone);
		cartao = new Cartao(numCartao, codSeguranca, dtVencimento);
	}
	
	public Avaliacao getAvaliacao() {
		return this.avaliacao;
	}

    public void setAvaliacao(int novaAvaliacao) {
        this.avaliacao.adicionarNovaAvaliacao(novaAvaliacao);
    }
}
