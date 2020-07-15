package com.ejemplo;

public class Main {

    public static void main(String[] args) {
	    // write your code here


        Lugar lugar1 = new Lugar("Barcelona", true, true);
        Lugar lugar2 = new Lugar("Madrid", false, true);
        Lugar lugar3 = new Lugar("PuebloPerdidoConCosta", true, false);
        Lugar lugar4 = new Lugar("PuebloPerdidoSinCosta", false, false);

        MedioDeTransporte avion = new Avion();
        MedioDeTransporte coche = new Coche();
        MedioDeTransporte barco = new Barco();
        // Calculamos la ruta en avion
        if (lugar1.esPosibleIrEnAvion(lugar2)){
            avion.calcularTiempo(lugar1.calcularDistancia(lugar2));
        } else {
            System.out.println("No es posible hacer esta ruta en avion");
        }
        // Calculamos la ruta en barco
        if (lugar1.esPosibleIrEnBarco(lugar2)){
            barco.calcularTiempo(lugar1.calcularDistancia(lugar2));
        } else {
            System.out.println("No es posible hacer esta ruta en barco");
        }
        // Calculamos la ruta en coche
        if (lugar1.esPosibleIrEnCoche(lugar2)){
            coche.calcularTiempo(lugar1.calcularDistancia(lugar2));
        } else {
            System.out.println("No es posible hacer esta ruta en coche");
        }


    }
}
