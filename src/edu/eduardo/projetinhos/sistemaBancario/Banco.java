package edu.eduardo.projetinhos.sistemaBancario;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, ContaCorrente> contas = new HashMap<>();

        int option = -1;

        while(option != 0){
            String menu = "\nBem-vindo ao Banco XYZ!\n\nEscolha uma opção:\n1. Criar Conta\n2. Depositar\n3. Saque\n4. Mostrar Saldo\n0. Sair\n";
            System.out.println(menu);
            option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println("Opção 1 selecionada: Criar Conta");
                    System.out.println("Escolha o tipo de conta:\n1. Conta Corrente\n2. Conta Poupança");
                    int tipoDeConta = scan.nextInt();

                    switch (tipoDeConta){
                        case 1:
                            ContaCorrente contaCorrente = new ContaCorrente();
                            System.out.println("Conta Corrente criada com sucesso!");
                            System.out.println(contaCorrente);
                            contas.put(contaCorrente.getNumeroConta(),contaCorrente);
                            break;
                        case 2:
                            ContaPoupanca contaPoupanca = new ContaPoupanca();
                            System.out.println("Conta Poupança criada com sucesso!");
                            break;
                        default:
                            ContaCorrente contaCorrente1 = new ContaCorrente();
                            System.out.println("Opção inválida. Escolhendo Conta Corrente por padrão.");
                            System.out.println(contaCorrente1);
                    }
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada: Depositar");
                    System.out.println("Digite o numero da conta");
                    String numeroContaDeposito = scan.next();
                    ContaCorrente contaDeposito = contas.get(numeroContaDeposito);
                    if (contaDeposito != null){
                        System.out.printf("Digite o valor que deseja depositar: R$");
                        double valor = scan.nextDouble();
                        contaDeposito.deposito(valor);
                        System.out.printf("Deposito de R$%.2f realizado com sucesso! Seu saldo atual é de R$%.2f", valor, contaDeposito.getSaldo());
                    }else{
                        System.out.println("Conta não encontrada. Verifique o número da conta.");
                    }
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada: Saque");
                    System.out.println("Digite o numero da conta");
                    String numeroContaSaque = scan.next();
                    ContaCorrente contaSaque = contas.get(numeroContaSaque);
                    if(contaSaque != null){
                        System.out.printf("Digite o valor para sacar: R$");
                        double valor = scan.nextDouble();
                        contaSaque.saque(valor);
                        System.out.printf("Saque de R$%.2f realizado com sucesso! Seu saldo atual é de R$%.2f", valor, contaSaque.getSaldo());
                    }
                    break;
                case 4:
                    System.out.println("Opção 4 selecionada: Mostrar Saldo");
                    System.out.println("Digite o numero da conta");
                    String contaSelecionada = scan.next();
                    ContaCorrente contaSaldo = contas.get(contaSelecionada);
                    if (contaSaldo != null){
                        double valor = contaSaldo.getSaldo();
                        System.out.printf("O seu saldo é de R$%.2f", valor);
                    }else {
                        System.out.println("Conta não encontrada. Verifique o número da conta.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("informação inválida");
            }
        }


    }
}
