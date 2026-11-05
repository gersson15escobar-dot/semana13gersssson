package com.uped.proyecto.modelo;

public class Pedido {

    static int precioUnitario(int total, int cantidad) {
        return total / cantidad;
    }

    static void procesar(int total, int cantidad) {
        int p = precioUnitario(total, cantidad);
        System.out.println("Precio unitario: $" + p);
    }

    public static void main(String[] args) {
        procesar(100, 4);
        procesar(90, 0);
        System.out.println("Pedidos procesados");
    }
}
