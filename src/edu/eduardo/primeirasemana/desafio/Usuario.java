package edu.eduardo.primeirasemana.desafio;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Está ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Está ligada? "+smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.dominuirVolume();
        smartTv.dominuirVolume();
        smartTv.dominuirVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.mudarCanal(50);
        System.out.println("Canal atual: "+smartTv.canal);

    }
}
