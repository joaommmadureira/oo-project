package negocio;

public class Teste {
	
	static Telefone t;
	static Usuario u;
	static Anfitriao a;
	static Cartao ca;
	
	public static void main(String[] args) {
		
		t = new Telefone();
		t.setDDD(061);
		t.setNumero(55555555);
		
		ca = new Cartao();
		ca.setNumeroCartao(567345);
		ca.setCodigo(441);
		ca.setDataVencimento(2024);
		
		
		
		u = new Usuario("Rafa",12345, t, ca);
		
		a = new Anfitriao("Luciana", 5, 5678, t, ca);
		
		
		
	}
}
