package com.ejemplo;

import java.util.Random;

public class Lugar {

    public String name;
    public boolean tieneAeropuerto;
    public boolean tienePuerto;

    public Lugar(String name, boolean tienePuerto, boolean tieneAeropuerto){
        this.name = name;
        this.tieneAeropuerto = tieneAeropuerto;
        this.tienePuerto = tienePuerto;
    }

    public int calcularDistancia(Lugar lugar){
        Random random = new Random();
        return random.nextInt(1000);
    }

    public boolean esPosibleIrEnAvion(Lugar lugar){
        return this.tieneAeropuerto && lugar.tieneAeropuerto;
    }

    public boolean esPosibleIrEnBarco(Lugar lugar){
        return this.tienePuerto && lugar.tienePuerto;
    }
    public boolean esPosibleIrEnCoche(Lugar lugar){
        return true;
    }
}
