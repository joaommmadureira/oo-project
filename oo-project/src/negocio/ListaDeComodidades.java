package negocio;

public class ListaDeComodidades {
    private boolean wiFi = false;
    private boolean piscina = false;
    private boolean maquinaLavar = false;
    private boolean arCondicionado = false;
    private boolean banheira = false;
    private int vagasGaragem = 0;

    public ListaDeComodidades(
        boolean temWiFi, boolean temPiscina, boolean temMaquinaLavar, 
        boolean temArCondicionado, boolean temBanheira, int temVagasGaragem
    ) {
        wiFi = temWiFi;
        piscina = temPiscina;
        maquinaLavar = temMaquinaLavar;
        arCondicionado = temArCondicionado;
        banheira = temBanheira;
        vagasGaragem = temVagasGaragem;
    }

    public boolean isWiFi() {
        return this.wiFi;
    }

    public void setWiFi(boolean wiFi) {
        this.wiFi = wiFi;
    }

    public boolean isPiscina() {
        return this.piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isMaquinaLavar() {
        return this.maquinaLavar;
    }

    public void setMaquinaLavar(boolean maquinaLavar) {
        this.maquinaLavar = maquinaLavar;
    }

    public boolean isArCondicionado() {
        return this.arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isBanheira() {
        return this.banheira;
    }

    public void setBanheira(boolean banheira) {
        this.banheira = banheira;
    }

    public int getVagasGaragem() {
        return this.vagasGaragem;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

}
