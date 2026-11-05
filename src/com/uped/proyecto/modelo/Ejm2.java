package com.uped.proyecto.modelo;

public class Ejm2 {

    static int promedio(int[] notas) {
        int suma = 0;
        for (int n : notas) {
            suma += n;
        }

        return suma / notas.length;
    }

    public static void main(String[] args) {
        int[][] grupos = {
                {8, 6, 10}, {}, {7} }; for (int[] g : grupos) {
                    System.out.println("Promedio: " + promedio(g));
                }
    }
}

// PREGUNTA 1
// ¿Qué grupo falló?
// RESPUESTA 1
// El segundo, {}: no tiene notas y notas.length vale 0

// PREGUNTA 2
//¿Dónde?
// RESPUESTA 2
// En el metodo promedio, línea 7: suma / notas.length

// PREGUNTA 3
// ¿Quién llamó?
// RESPUESTA 3
// main, en la línea 13

// PREGUNTA 4
// ¿Por qué no aparece {7}?
// RESPUESTA 4
// Nadie atrapó la excepción: el programa terminó en el segundo grupo