package edu.eduardo.segundasemana.poo;


import edu.eduardo.segundasemana.poo.heranca.Moto;
import edu.eduardo.segundasemana.poo.heranca.Veiculo;

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

        /*
          Upcast -> Transformando uma subclasse em uma superclasse, subindo na hierarquia de classes
         */
        Veiculo moto = new Moto();

        /*
          Downcast -> Transformando uma Superclasse em uma Subclasse, descendo na hierarquia de classes
          é suber aconselhavel a nao se usar o downcast pois geralmente apresenta muito erro.
         */
        Moto veiculo = (Moto) new Veiculo();

    }
}
