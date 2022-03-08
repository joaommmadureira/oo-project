package negocio;

public class Localizacao {

	private String estado;
	private String cidade;
	
	public Localizacao(String e, String c) {
		estado = e;
		cidade = c;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}
