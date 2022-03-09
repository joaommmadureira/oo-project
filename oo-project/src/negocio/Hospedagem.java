package negocio;

public abstract class Hospedagem {
    protected String titulo;
    protected float precoDiaria;
    protected int tamanho;
    protected int numCamas;
    protected int maxHospedes;
    protected float taxaCancelamento;
    protected Avaliacao avaliacao = new Avaliacao();
    protected ListaDeComodidades comodidades;
    protected Endereco endereco;
    protected Anfitriao anfitriao;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecoDiaria() {
        return this.precoDiaria;
    }

    public void setPrecoDiaria(float precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getNumCamas() {
        return this.numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getMaxHospedes() {
        return this.maxHospedes;
    }

    public void setMaxHospedes(int maxHospedes) {
        this.maxHospedes = maxHospedes;
    }

    public float getTaxaCancelamento() {
        return this.taxaCancelamento;
    }

    public void setTaxaCancelamento(float taxaCancelamento) {
        this.taxaCancelamento = taxaCancelamento;
    }

    public Avaliacao getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int novaAvaliacao) {
        this.avaliacao.adicionarNovaAvaliacao(novaAvaliacao);
    }

    public ListaDeComodidades getComodidades() {
        return this.comodidades;
    }

    public void setComodidades(ListaDeComodidades comodidades) {
        this.comodidades = comodidades;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Anfitriao getAnfitriao() {
        return this.anfitriao;
    }

    public void setAnfitriao(Anfitriao anfitriao) {
        this.anfitriao = anfitriao;
    }

}
