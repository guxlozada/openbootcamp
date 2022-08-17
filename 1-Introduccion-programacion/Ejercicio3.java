
/**
 * Ejercicio3
 * 
 * @author Gustavo Lozada
 */
public class Ejercicio3 {
  /**
   * Main
   * 
   * @param args
   */
  public static void main(String[] args) {
    double num1, num2, num3;
    num1 = 1;
    num2 = 1.1;
    num3 = 3.9;
    sumar(num1, num2, num3);

    // Parte 2
    Coche miCoche = new Coche();
    miCoche.agregarPuerta();
    miCoche.imprimirDetalles();
  }

  /**
   * Sumar
   * 
   * @param num1
   * @param num2
   * @param num3
   */
  static void sumar(double num1, double num2, double num3) {
    final double suma = num1 + num2 + num3;
    System.out.printf("La suma de los tres numeros es: %.2f", suma);
  }

  /**
   * Coche
   */
  public static class Coche {
    private int numPuertas;

    Coche() {
      this.numPuertas = 0;
    }

    void agregarPuerta() {
      numPuertas++;
    }

    int getNumPuertas() {
      return numPuertas;
    }

    void imprimirDetalles() {
      System.out.printf("\nEl coche tiene %d puerta(s).", this.numPuertas);
    }

  }
}
