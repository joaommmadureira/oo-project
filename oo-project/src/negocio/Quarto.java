package negocio;

public class Quarto extends Hospedagem {

    private boolean compartilhado;
    private boolean suite;

    public Quarto(
        String t,
        Anfitriao anf,
        float diaria,
        int tam,
        int camas,
        int hospedes,
        boolean eCompartilhado,
        boolean eSuite,
        float taxCancel,
        Endereco end,
        boolean wiFi, 
        boolean piscina, 
        boolean maquinaLavar, 
        boolean arCondicionado, 
        boolean banheira, 
        int vagasGaragem
    ) {
        titulo = t;
        anfitriao = anf;
        precoDiaria = diaria;
        tamanho = tam;
        numCamas = camas;
        maxHospedes = hospedes;
        compartilhado = eCompartilhado;
        suite = eSuite;
        taxaCancelamento = taxCancel;
        endereco = end;
        comodidades = new ListaDeComodidades(wiFi, piscina, maquinaLavar, arCondicionado, banheira, vagasGaragem);
    }

    public boolean isCompartilhado() {
        return this.compartilhado;
    }

    public void setCompartilhado(boolean compartilhado) {
        this.compartilhado = compartilhado;
    }

    public boolean isSuite() {
        return this.suite;
    }

    public void setSuite(boolean suite) {
        this.suite = suite;
    }
}
