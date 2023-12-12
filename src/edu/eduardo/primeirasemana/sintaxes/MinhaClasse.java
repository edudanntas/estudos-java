package edu.eduardo.primeirasemana.sintaxes;

import java.util.Scanner;

public class MinhaClasse{
    public static void main(String[]args){
        Scanner scan;
        scan = new Scanner(System.in);
        String nomeUm, nomeDois;

        System.out.println("Digite seu primeiro nome: ");
        nomeUm = scan.next();
        System.out.println("Digite seu segundo nome: ");
        nomeDois = scan.next();

        String nomeCompleto = nomeCompleto(nomeUm, nomeDois);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String nomeUm, String nomeDois){
        return nomeUm.concat(" ").concat(nomeDois);
    }
}