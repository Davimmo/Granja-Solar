package main.java.br.edu.univasf.projetomodelo.model;

public class Tigre extends Animal {

    private String subespecie; // Ex: Tigre de Bengala, Tigre Siberiano, etc.
    private double pesoMedio; // Em quilogramas
    private double comprimento; // Em metros

    public Tigre(String nomeCientifico, String[] nomesPopulares, String habitoAlimentar,
                 String distribuicaoGeografica, String expectativaDeVida, String comportamento,
                 String epocaDeReproducao, String subespecie, double pesoMedio, double comprimento) {
        super(nomeCientifico, nomesPopulares, habitoAlimentar, distribuicaoGeografica,
                expectativaDeVida, comportamento, epocaDeReproducao);
        this.subespecie = subespecie;
        this.pesoMedio = pesoMedio;
        this.comprimento = comprimento;
    }

    public String getSubespecie() {
        return subespecie;
    }

    public void setSubespecie(String subespecie) {
        this.subespecie = subespecie;
    }

    public double getPesoMedio() {
        return pesoMedio;
    }

    public void setPesoMedio(double pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "subespecie='" + subespecie + '\'' +
                ", pesoMedio=" + pesoMedio +
                ", comprimento=" + comprimento +
                ", nomeCientifico='" + getNomeCientifico() + '\'' +
                ", nomesPopulares=" + String.join(", ", getNomesPopulares()) +
                ", habitoAlimentar='" + getHabitoAlimentar() + '\'' +
                ", distribuicaoGeografica='" + getDistribuicaoGeografica() + '\'' +
                ", expectativaDeVida='" + getExpectativaDeVida() + '\'' +
                ", comportamento='" + getComportamento() + '\'' +
                ", epocaDeReproducao='" + getEpocaDeReproducao() + '\'' +
                '}';
    }
}

