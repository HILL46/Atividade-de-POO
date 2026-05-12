package universidade.prova;

public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double av1, double av2, double av3) {
        super(av1, av2, av3);

        this.peso1 = 1;
        this.peso2 = 1;
        this.peso3 = 1;

        this.mediaMinima = 7;
    }

    @Override
    public double calcularMedia() {
        return (av1 + av2 + av3) / 3;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaAV3UCB(this);
    }
}