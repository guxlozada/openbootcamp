/**
 * Ejercicio8
 * 
 * @author Gustavo Lozada
 */
public class Ejercicio8 {
  /**
   * Main.
   * 
   * @param args
   */
  public static void main(String[] args) {
    Persona miPersona = new Persona();
    miPersona.setNombre("Juan Perez");
    miPersona.setEdad(18);
    miPersona.setTelefono("+5930995576825");
    System.out.printf("Detalles de la persona%n Nombre: %s%n Edad: %d%n Telefono: %s", miPersona.getNombre(),
        miPersona.getEdad(),
        miPersona.getTelefono());
  }

  /**
   * Persona
   */
  static class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
      return edad;
    }

    public void setEdad(int edad) {
      this.edad = edad;
    }

    public String getNombre() {
      return nombre;
    }

    public void setNombre(String nombre) {
      this.nombre = nombre;
    }

    public String getTelefono() {
      return telefono;
    }

    public void setTelefono(String telefono) {
      this.telefono = telefono;
    }

  }
}
