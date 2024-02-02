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

        System.out.println("\nVendedor");
        vendedor.processar();

        System.out.println("\nFaxineiro");
        faxineiro.processar(); // o faxineiro não tem o método na `processar()` na sua classe

        System.out.println("\nGerente");
        gerente.processar();
    }
}
