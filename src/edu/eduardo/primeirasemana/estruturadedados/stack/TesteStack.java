package edu.eduardo.primeirasemana.estruturadedados.stack;

import edu.eduardo.primeirasemana.estruturadedados.equalshash.Carro;

import java.util.Stack;

public class TesteStack {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Volkswagen"));
        stackCarros.push(new Carro("Audi"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);
    }
}
