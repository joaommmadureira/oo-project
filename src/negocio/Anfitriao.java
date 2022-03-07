package negocio;

public class Anfitriao extends Pessoa{
	private float avaliacao;
	
	public Anfitriao(String n, int c, Telefone t) {
		nome = n;
		cpf = c;
		numTel = t;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Telefone getNumTel() {
		return numTel;
	}
	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}
	public Cartao getCartao() {
		return cartao;
	}
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	
}
