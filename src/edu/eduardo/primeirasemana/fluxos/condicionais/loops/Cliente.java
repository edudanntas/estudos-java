package edu.eduardo.primeirasemana.fluxos.condicionais.loops;

public class Cliente {
    private String nome;
    private String cpf;
    private byte idade;

    public Cliente(String nome, String cpf, byte idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
