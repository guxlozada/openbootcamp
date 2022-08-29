package org.example;

/**
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 * Tened en cuenta que los textos pueden venir de un array de tipo String
 *
 * @author Gustavo Lozada
 */
public class EjerciciosTema3 {

    /**
     * Main.
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Luis", "Mario", "Eduardo"};
        String resultado = null;

        for (String texto : nombres) {
            resultado = concatenarTexto(resultado, texto);
        }
        System.out.println("Texto concatenado: " + resultado);
    }

    /**
     * Concatenar 2 textos
     *
     * @param base
     * @param sufijo
     * @return
     */
    static String concatenarTexto(String base, String sufijo) {
        String resultado = base;
        if (base == null) {
            resultado = "";
        }
        if (sufijo != null) {
            resultado += sufijo;
        }
        return resultado;
    }
}
