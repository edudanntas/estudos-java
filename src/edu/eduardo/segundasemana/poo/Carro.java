package edu.eduardo.segundasemana.poo;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    void calcularAbastecimento(double valorGasolina){
        double valorTotal = valorGasolina * capacidadeTanque;
        System.out.printf("O valor total para encher o tanque é de R$%.2f\n", valorTotal);
    }

}
