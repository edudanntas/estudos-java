package edu.eduardo.primeirasemana.estruturadedados.vetor.teste;

import edu.eduardo.primeirasemana.estruturadedados.vetor.Vetor;

public class TesteVetor05 {
    public static void main(String[] args) {
        Vetor temperatura = new Vetor(4);

        temperatura.adiciona(33.7);
        temperatura.adiciona(32.9);
        temperatura.adiciona(28.3);

        System.out.println(temperatura.busca(34.8));
    }
}
