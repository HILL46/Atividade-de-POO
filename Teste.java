package universidade.prova.teste;

import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaUCB;

public class Teste {

    public static void main(String[] args) {

        ProvaUCB ucb =
                new ProvaUCB(7, 8, 9);

        System.out.println("===== UCB =====");

        System.out.println(
                "Media: " +
                        ucb.calcularMedia()
        );

        System.out.println(
                "Aprovado: " +
                        (ucb.aprovado() ? "Sim" : "Não")
        );

        ProvaFafifo fafifo =
                new ProvaFafifo(5, 6, 8);

        System.out.println("===== FAFIFO =====");

        System.out.println(
                "Media: " +
                        fafifo.calcularMedia()
        );

        System.out.println(
                "Aprovado: " +
                        (fafifo.aprovado()? "Sim" : "Não")
        );
    }
}
