package edu.eduardo.primeirasemana.estruturadedados.vetor;

import java.util.Arrays;

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

    public double busca(int posicao){
        if (!(posicao >=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posicão inválida");
        }
        return this.elementos[posicao];
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for(int i =0; i<this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}
