package edu.eduardo.primeirasemana.estruturadedados.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteMap {
    public static void main(String[] args) {
        Map<String, String> aluno  = new HashMap<>();

        aluno.put("Nome", "Eduardo");
        aluno.put("Idade", "25");
        aluno.put("Media", "7.8");
        aluno.put("Turma", "3A");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2  = new HashMap<>();

        aluno2.put("Nome", "Marcelo");
        aluno2.put("Idade", "23");
        aluno2.put("Media", "9");
        aluno2.put("Turma", "3B");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }
}
