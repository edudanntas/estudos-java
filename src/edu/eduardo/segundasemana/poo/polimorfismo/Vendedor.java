package edu.eduardo.segundasemana.poo.polimorfismo;

public class Vendedor extends Funcionario{

    @Override
    void processar(){
        System.out.println("Vendedor processou o pagamento");
    }
}
