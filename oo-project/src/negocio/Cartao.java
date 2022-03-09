package negocio;

import java.util.Date;

public class Cartao {

	private long numeroCartao;
	private int codigo;
	private Date dataVencimento;
	
	public Cartao(long n, int c, Date d) {
		numeroCartao = n;
		codigo = c;
		dataVencimento = d;
	}
	
	public Cartao() {
		
	}
	
	//gets e sets dos atributos
	public long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

    public Date getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
	

	
}

