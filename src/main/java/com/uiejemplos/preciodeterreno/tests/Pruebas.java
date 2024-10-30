package com.uiejemplos.preciodeterreno.tests;

import com.uiejemplos.preciodeterreno.modelos.Terreno;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Pruebas {
    public Pruebas() {
    }

    @Test
    public void pruebaCalcularPrecio() {
        Terreno terreno = new Terreno(10f, 20f, 50f);
        //asserEquals(10000f,terreno.calcularPrecio(), 0.000001f);
        assertEquals(10000f, terreno.calcularPrecio(), 0.000001f);

    }

    @Test
    public void pruebasCalcularArea() {
        Terreno terreno = new Terreno(10f, 20f, 50f);
        assertTrue(terreno.calcularArea() == 200f);
        //asserTrue( codition: terreno,calcularArea()==200f);
        //assertEquals(200f, terreno.calcularArea(), 0.001f);
    }
}
