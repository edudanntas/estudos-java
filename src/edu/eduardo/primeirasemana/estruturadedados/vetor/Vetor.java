package edu.eduardo.primeirasemana.estruturadedados.vetor;

public class Vetor {
    private double[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new double[capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(double elemento){
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == 0.0){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    /*public void adiciona(double elemento) throws Exception{
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }else {
            throw new Exception("O vetor está cheio no momento, não é possivel adicionar mais elementos");
        }
    }*/

    public boolean adiciona(double elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
}
