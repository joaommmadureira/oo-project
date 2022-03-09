package negocio;

public class Apartamento extends Hospedagem {

    private int numQuartos;
    private int andar;
    private String vista;

    public Apartamento(
        String t,
        Anfitriao anf,
        float diaria,
        int tam,
        int camas,
        int quartos,
        int andarAp,
        String direcaoVista,
        int hospedes,
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
        numQuartos = quartos;
        andar = andarAp;
        vista = direcaoVista;
        maxHospedes = hospedes;
        taxaCancelamento = taxCancel;
        endereco = end;
        comodidades = new ListaDeComodidades(wiFi, piscina, maquinaLavar, arCondicionado, banheira, vagasGaragem);
    }

    public int getNumQuartos() {
        return this.numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getAndar() {
        return this.andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public String getVista() {
        return this.vista;
    }

    public void setVista(String vista) {
        this.vista = vista;
    }
}
