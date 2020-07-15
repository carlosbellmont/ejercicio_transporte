package com.ejemplo;

public class MedioDeTransporte {
    public int velocidad;

    public void calcularTiempo(int distancia){
        System.out.println("El tiempo que lleva recorrer " + distancia +" a " + velocidad + " km/h es de " + distancia/velocidad);
    }


}
