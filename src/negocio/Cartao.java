package negocio;

public class Cartao {

	private int numeroCartao;
	private int codigo;
	private int dataVencimento;
	
	public Cartao(int n, int c, int d) {
		numeroCartao = n;
		codigo = c;
		dataVencimento = d;
	}
	
	//gets e sets dos atributos
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(int dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	

	
}

