package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();

        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPotcast = new Podcast();

        miPotcast.setPresentador("Gabriela");
        miPotcast.setTitulo("Cafe.Tech");

        //cancion

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();

        }
        for (int i = 0; i < 200; i++) {
            miCancion.reproduce();
        }
    // potcast

        for (int i = 0; i < 100; i++) {
            miPotcast.meGusta();

        }
        for (int i = 0; i < 8000; i++) {
            miPotcast.reproduce();
        }


        System.out.println("Total de reproducciones : " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos=new MisFavoritos();
        favoritos.adicione(miPotcast);
        favoritos.adicione(miCancion);


    }
}
