package negocio;

public class Usuario extends Pessoa {
	
	public Usuario(String n, int c, Telefone t, Cartao ca) {
		nome = n;
		numTel = t;
		cpf = c;
		cartao = ca;
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

