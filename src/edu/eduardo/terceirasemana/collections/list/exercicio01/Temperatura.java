package edu.eduardo.terceirasemana.collections.list.exercicio01;

public class Temperatura {
    private String mes;
    private double temeperatura;

    public Temperatura(String mes, double temeperatura) {
        this.mes = mes;
        this.temeperatura = temeperatura;
    }

    public String getMes() {
        return mes;
    }

    public double getTemeperatura() {
        return temeperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temeperatura=" + temeperatura +
                '}';
    }
}
