package com.uiejemplos.preciodeterreno.modelos;

public class Terreno {
    public char[] calcularPrecioterr;
    private double ancho;
    private double largo;
    private double costoPorMetroCuadrado;

    public Terreno(double ancho, double largo, double costoPorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.costoPorMetroCuadrado = costoPorMetroCuadrado;
        this.ancho = ancho;
    }
    public double calcularArea() {
            return largo * ancho;
        }
        public double calcularPrecio() {
        return calcularArea() * costoPorMetroCuadrado;
        }
    }




