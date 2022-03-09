package negocio;

public class Casa extends Hospedagem {
    
    private int numQuartos;
    private int numAndares;

    public Casa(
        String t,
        Anfitriao anf,
        float diaria,
        int tam,
        int camas,
        int quartos,
        int andares,
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
        numAndares = andares;
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

    public int getNumAndares() {
        return this.numAndares;
    }

    public void setNumAndares(int numAndares) {
        this.numAndares = numAndares;
    }

}
