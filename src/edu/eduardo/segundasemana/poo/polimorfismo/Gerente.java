package edu.eduardo.segundasemana.poo.polimorfismo;

public class Gerente extends Funcionario{

    @Override
    void processar(){
        System.out.println("O Gerente processou o pagamento");
    }
}
