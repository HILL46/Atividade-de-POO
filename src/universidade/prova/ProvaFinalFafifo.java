package universidade.prova;

public class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade prova) {
        super(prova);
    }

    @Override
    public boolean habilitadoRealizarProva() {

        return !prova.aprovado();
    }
}