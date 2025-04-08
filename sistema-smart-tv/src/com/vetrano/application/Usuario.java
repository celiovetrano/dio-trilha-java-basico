package com.vetrano.application;
import com.vetrano.entities.SmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.getCanal());

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual: " + smartTv.getCanal());

        System.out.println("TV Ligada? " + smartTv.isLigada());
        System.out.println("Canal Atual: " + smartTv.getCanal());
        System.out.println("Volume Atual: " + smartTv.getVolume());

        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada? " + smartTv.isLigada());

        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada? " + smartTv.isLigada());


    }
}
