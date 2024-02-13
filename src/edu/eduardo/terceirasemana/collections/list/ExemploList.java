package edu.eduardo.terceirasemana.collections.list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        System.out.println("Adicionar 7 elementos na lista: ");
        notas.add(4d);
        notas.add(0d);
        notas.add(9.6);
        notas.add(3.6);
        notas.add(7.9);
        notas.add(5d);
        notas.add(7d);
        System.out.println(notas.toString());

        System.out.println("Exibir a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        System.out.println("Substituir a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");

        // da pra fazer em toString();
         System.out.println(notas.toString());

        //ou em um loop foreach:
        /*for (double nota : notas){
            System.out.println(nota);
        }*/

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));


        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // fazendo com iterator
        Iterator<Double> iterator = notas.iterator();
        double somaIterator = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            somaIterator += next;
        }


        // fazendo com For
        double somaFor = 0d;
        for (double nota : notas) {
            somaFor += nota;
        }

        System.out.println("Exiba a soma das notas: " + somaIterator);

        System.out.println("Exiba a média das nota: " + (somaFor/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as ntoas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);


        System.out.println("Apague toda a lista: ");
        notas.clear();

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}
