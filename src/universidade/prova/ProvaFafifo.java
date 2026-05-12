package universidade.prova;

public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double av1, double av2, double av3) {
        super(av1, av2, av3);

        this.peso1 = 1;
        this.peso2 = 1;
        this.peso3 = 3;

        this.mediaMinima = 6;
    }

    @Override
    public double calcularMedia() {

        double soma =
                (av1 * peso1) +
                        (av2 * peso2) +
                        (av3 * peso3);

        return soma / 5;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        return new ProvaFinalFafifo(this);
    }
}