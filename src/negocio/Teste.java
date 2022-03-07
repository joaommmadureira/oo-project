package negocio;

public class Teste {
	
	static Telefone t;
	static Usuario u;
	static Anfitriao a;
	static Cartao c;
	
	public static void main(String[] args) {
		
		t = new Telefone();
		t.setDDD(061);
		t.setNumero(55555555);
		
		
		u = new Usuario("Rafa",12345, t);
		
		
		
	}
}
