/**
 * Ejercicio4
 * 
 * @author Gustavo Lozada
 */
public class Ejercicio4 {
  /**
   * Main
   * 
   * @param args
   */
  public static void main(String[] args) {
    int numeroIf = 1;
    String resIf = null;
    if (numeroIf > 0) {
      resIf = "positivo";
    } else if (numeroIf < 0) {
      resIf = "negativo";
    } else {
      resIf = "0";
    }
    System.out.printf("numeroIf es %s%n", resIf);

    // Parte 2
    int numeroWhile = 0;
    while (numeroWhile < 3) {
      System.out.printf("while > numeroWhile: %d%n", numeroWhile);
      numeroWhile++;
    }

    // Parte 3
    do {
      numeroWhile++;
      System.out.printf("do-while > numeroWhile: %d%n", numeroWhile);
    } while (false);

    // Parte 4
    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
      System.out.printf("numeroFor: %d%n", numeroFor);
    }

    // Parte 5
    final String estacion = "PRIMAVERA";
    switch (estacion) {
      case "PRIMAVERA":
        System.out.printf("estacion: %s%n", estacion);
        break;
      case "VERANO":
        System.out.printf("estacion: %s%n", estacion);
        break;
      case "OTOÑO":
        System.out.printf("estacion: %s%n", estacion);
        break;
      case "INVIERNO":
        System.out.printf("estacion: %s%n", estacion);
        break;
      default:
        System.out.printf("%s no corresponde a una estacion.", estacion);
    }
  }
}
