package edu.eduardo.terceirasemana.collections.list.ordenada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>();

        System.out.println("---\tAdicionar Gatos\t---");
        meusGatos.add(new Gato("Caramelo", 8, "Laranja"));
        meusGatos.add(new Gato("Jon", 13, "Preto"));
        meusGatos.add(new Gato("Simba", 3, "Tigrado"));
        meusGatos.add(new Gato("Frajola", 3, "Preto e Branco"));
        meusGatos.add(new Gato("Mimi", 2, "Cinza"));
        meusGatos.add(new Gato("Whiskers", 6, "Marrom"));
        meusGatos.add(new Gato("Felix", 1, "Preto"));

        System.out.println(meusGatos);

        System.out.println("---\tOrdem Aleatoria\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem por Nome\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem por Idade\t---");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem por Cor\t---");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem por Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
