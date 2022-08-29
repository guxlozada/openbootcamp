package org.example;

/**
 * Para este ejercicio tendreis que crear una funcion que reciba un precio y devuelva el precio con el IVA incluido.
 *
 * @author Gustavo Lozada
 */
public class EjerciciosTema2 {

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        final float porcentajeIVA = 12.0f;
        final float precio = 50.0f;

        final float resultado = addIVA(precio, porcentajeIVA);
        System.out.printf("Precio: %.2f%nPrecio + IVA: %.2f", precio, resultado);
    }

    /**
     * Funcion que calcula y suma el IVA.
     *
     * @param precio
     * @param porcentajeIVA
     * @return
     */
    static float addIVA(float precio, float porcentajeIVA) {
        final float valorIva = precio * porcentajeIVA / 100;
        return precio + valorIva;
    }
}
