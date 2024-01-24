package edu.eduardo.primeirasemana.estruturadedados.equalshash;

public class Teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Ford1");

        System.out.println(carro1.hashCode() + " " +  carro2.hashCode());
        System.out.println(carro1.equals(carro2));
    }
}
