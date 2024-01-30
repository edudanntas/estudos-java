package edu.eduardo.primeirasemana.estruturadedados.set;

import edu.eduardo.primeirasemana.estruturadedados.equalshash.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
    public static void main(String[] args) {
        Set<Carro> hashSetCarro = new HashSet<>();

        hashSetCarro.add(new Carro("Ford"));
        hashSetCarro.add(new Carro("Chevrolet"));
        hashSetCarro.add(new Carro("Renault"));
        hashSetCarro.add(new Carro("Fiat"));

        System.out.println(hashSetCarro);

        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Renault"));
        treeSetCarros.add(new Carro("Fiat"));

        System.out.println(treeSetCarros);
    }
}
