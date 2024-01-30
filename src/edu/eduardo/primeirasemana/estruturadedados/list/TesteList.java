package edu.eduardo.primeirasemana.estruturadedados.list;

import edu.eduardo.primeirasemana.estruturadedados.equalshash.Carro;

import java.util.*;

public class TesteList {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));
        listaCarros.add(new Carro("Fiat"));

        System.out.println(listaCarros.contains(new Carro("Ford")));

        System.out.println(listaCarros.get(2));

        System.out.println(listaCarros.indexOf(new Carro("Fiat")));

        System.out.println(listaCarros.remove(2));

        System.out.println(listaCarros);
    }
}
