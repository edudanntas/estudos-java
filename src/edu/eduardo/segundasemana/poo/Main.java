package edu.eduardo.segundasemana.poo;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setCor("Branco");
        carro1.setModelo("Fiat Uno");
        carro1.setCapacidadeTanque(45);

        carro1.calcularAbastecimento(5.39);

        Carro carro2 = new Carro("Vermelho", "Uno", 87);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.getModelo());

        carro2.calcularAbastecimento(4.87);
    }
}
