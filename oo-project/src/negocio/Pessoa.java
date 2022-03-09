package negocio;

public abstract class Pessoa {
	
	protected String nome;
	protected long cpf;
	protected Telefone numTel;
	protected Cartao cartao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}
    
	public void setCpf(long cpf) {
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

    // Sobrescrevendo método toString para pessoa
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf();
    } 
}

	
