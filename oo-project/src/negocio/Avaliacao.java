package negocio;

public class Avaliacao {
    
    private float nota = 0;
    private int quantAvaliacoes = 0;

    public void adicionarNovaAvaliacao(int novaAvaliacao) {
        // Aumentando o total de avaliações
        this.quantAvaliacoes++;
        // Calculando a nova nota
        this.nota = (this.nota + novaAvaliacao / this.quantAvaliacoes);
    }

    public float getNota() {
        return this.nota;
    }

    public int getQuantAvaliacoes() {
        return this.quantAvaliacoes;
    }
}
