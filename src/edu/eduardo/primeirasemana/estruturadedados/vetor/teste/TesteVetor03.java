package edu.eduardo.primeirasemana.estruturadedados.vetor.teste;

import edu.eduardo.primeirasemana.estruturadedados.vetor.Vetor;

public class TesteVetor03 {
    public static void main(String[] args) {
        Vetor temperatura = new Vetor(5);

        temperatura.adiciona(44.6);
        temperatura.adiciona(39.8);
        temperatura.adiciona(23.6);

        System.out.println(temperatura.tamanho());
        System.out.println(temperatura);
    }
}
