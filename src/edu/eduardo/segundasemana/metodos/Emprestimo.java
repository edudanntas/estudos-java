package edu.eduardo.segundasemana.metodos;

public class Emprestimo {
    public static void calcularEmprestimo(double valor, int parcelas){
        double juros = (valor * 2 * parcelas) / 100;
        double valorTotal = valor + juros;
        System.out.println("O valor total do emprestimo de R$" + valor + " é de: R$" + valorTotal);
    }

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getOitoParcelas(){
        return 8;
    }
}
