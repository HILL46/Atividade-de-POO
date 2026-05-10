package universidade.prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade prova) {
        super(prova);
    }

    @Override
    public boolean habilitadoRealizarProva() {
        return true;
    }
}