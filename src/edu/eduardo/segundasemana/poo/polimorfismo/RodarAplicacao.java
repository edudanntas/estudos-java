package edu.eduardo.segundasemana.poo.polimorfismo;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();

        // Vendedor vendedor1 = new Funcionario();

        //Gerente gerente1 = (Gerente) new Funcionario();
        System.out.println("Funcionario");
        funcionario.processar();

        System.out.println("Vendedor");
        vendedor.processar();

        System.out.println("Faxineiro");
        faxineiro.processar();
    }
}
