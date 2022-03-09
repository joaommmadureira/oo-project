package negocio;

public class Endereco {
	
    private Localizacao localizacao;

	private int cep;
	private String referencia;
	private String complemento;

    public Endereco(Localizacao localizacao, int cep, String referencia, String complemento) {
        this.cep = cep;
        this.referencia = referencia;
        this.complemento = complemento;
        this.localizacao = localizacao;
    }

    public Endereco(Localizacao localizacao, int cep, String referencia) {
        this.cep = cep;
        this.referencia = referencia;
        this.localizacao = localizacao;
    }
	
	
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
    public Localizacao getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

}

