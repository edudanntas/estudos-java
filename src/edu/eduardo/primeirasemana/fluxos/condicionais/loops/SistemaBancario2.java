package edu.eduardo.primeirasemana.fluxos.condicionais.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaBancario2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldo = 0;
        Cliente[] clientes = new Cliente[20];
        int proximaPosicaoDisponivel = 0;

        while (true){
            System.out.println("Escolha uma opção para continuar: ");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Ver Saldo");
            System.out.println("4: Criar cliente");
            System.out.println("5: Sair");
            int opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Insira o valor que deseja depositar: ");
                    double valorDeposito = scan.nextDouble();
                    saldo = depositar(saldo, valorDeposito);
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja sacar: ");
                    double valorSaque = scan.nextDouble();
                    saldo = sacar(saldo, valorSaque);
                    break;
                case 3:
                    System.out.println("O seu saldo é de: R$"+saldo+"\n");
                    break;
                case 4:
                    Cliente novoCliente = criarCliente();
                    adicionarClienteAoArray(clientes, novoCliente, proximaPosicaoDisponivel);
                    System.out.println("Cliente adicionado com sucesso");
                case 5:
                    return;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }

    public static double depositar(double saldo, double valorParaDeposito){
        if(valorParaDeposito > 0){
            System.out.println("Depositando o valor de: R$"+valorParaDeposito);
            return saldo + valorParaDeposito;
        }else{
            System.out.println("Valor inválido para depósito!");
        }
        return saldo;
    }

    public static double sacar(double saldo, double valorParaSaque){
        if(valorParaSaque > 0){
            if(valorParaSaque <= saldo){
                System.out.println("Sacando o valor de: R$"+valorParaSaque);
                 return saldo - valorParaSaque;
            } else{
                System.out.println("Você não tem saldo suficiente para realizar o saque!");
            }
        } else{
            System.out.println("Valor inválido para saque!");
        }

        return saldo;
    }

    public static Cliente criarCliente() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = teclado.next();

        System.out.println("Digite o CPF do cliente:");
        String cpf = teclado.next();

        byte idade = 0;
        boolean idadeValida = false;
        while (!idadeValida) {
            try {
                System.out.println("Digite a idade do cliente:");
                idade = teclado.nextByte();
                idadeValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Idade inválida. Por favor, insira um número válido.");
                teclado.nextLine(); // Limpe o buffer do scanner
            }
        }

        Cliente novoCliente = new Cliente(nome, cpf, idade);

        return novoCliente;
    }

    public static void adicionarClienteAoArray(Cliente[] clientes, Cliente novoCliente, int proximaPosicaoDisponivel) {
        if (proximaPosicaoDisponivel < clientes.length) {
            clientes[proximaPosicaoDisponivel] = novoCliente; // 'novoCliente' é a instância que você criou
            proximaPosicaoDisponivel++;
            System.out.println("Cliente adicionado com sucesso!");
        } else {
            System.out.println("O array de clientes está cheio!");
        }

    }


}
