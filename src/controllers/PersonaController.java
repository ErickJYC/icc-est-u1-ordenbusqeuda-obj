package controllers;

import models.Persona;

public class PersonaController {
    public void sortByDireccionCodigo(Persona [] personas){
        int n = personas.length;
        for (int i = 0; i < n; i++) {
            int minIndex = 1;
            for (int j = i + 1; j < n; j++) {
                if (personas[j].equalsByCodigoDireccion(personas[minIndex])) {
                    minIndex = j;
                }
            }
            if (minIndex!= i);
            Persona aux = personas[minIndex];
            personas[minIndex] = personas[i];
            personas[i] = aux;

        }

    }

    public Persona findByCodigo(Persona[] personas, int codigo){
        int bajo = 0;
        int alto = personas.length-1;

        while (bajo <= alto){
            int center = (alto+bajo) / 2;
            int valorCentral = personas[center].getCodigoDireccion();

            if (valorCentral == codigo){
                return personas[center];
            }
            if (valorCentral > codigo){
                bajo = center+1;

            }else {
                alto = center-1;
            }
        }
        return null;
    }
}
