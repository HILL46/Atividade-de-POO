package universidade.prova;

public abstract class ProvaUniversidade {

    protected double av1;
    protected double av2;
    protected double av3;

    protected double peso1;
    protected double peso2;
    protected double peso3;

    protected double mediaMinima;

    protected boolean realizouFinal;

    public ProvaUniversidade(double av1, double av2, double av3) {
        this.av1 = av1;
        this.av2 = av2;
        this.av3 = av3;
    }

    public abstract double calcularMedia();

    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }
}