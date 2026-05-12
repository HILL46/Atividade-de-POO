package universidade.prova;

public abstract class ProvaFinalUniversidade {

    protected double notaFinal;
    protected double pesoFinal;

    protected boolean realizouProva;

    protected ProvaUniversidade prova;

    public ProvaFinalUniversidade(ProvaUniversidade prova) {
        this.prova = prova;
    }

    public abstract boolean habilitadoRealizarProva();
}