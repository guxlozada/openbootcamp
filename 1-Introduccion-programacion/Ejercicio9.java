/**
 * @author Gustavo Lozada
 */
public class Ejercicio9 {

  /**
   * Main.
   * 
   * @param args
   */
  public static void main(String[] args) {
    Cliente miCliente = new Cliente();
    miCliente.setNombre("Juan Perez");
    miCliente.setEdad(18);
    miCliente.setTelefono("+5930995576825");
    miCliente.setCredito(100.0);
    System.out.printf("Detalles del cliente: Nombre: %s, Edad: %d, Telefono: %s, Credito: %.2f", miCliente.getNombre(),
        miCliente.getEdad(), miCliente.getTelefono(), miCliente.getCredito());
    Trabajador miTrabajador = new Trabajador();
    miTrabajador.setNombre("Lucia Mendoza");
    miTrabajador.setEdad(27);
    miTrabajador.setTelefono("+593098451245");
    miTrabajador.setSalario(200.0);
    System.out.printf("%nDetalles del trabajador: Nombre: %s, Edad: %d, Telefono: %s, Salario: %.2f",
        miTrabajador.getNombre(), miTrabajador.getEdad(), miTrabajador.getTelefono(), miTrabajador.getSalario());
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

  /**
   * Cliente
   */
  static class Cliente extends Persona {
    private double credito;

    public double getCredito() {
      return credito;
    }

    public void setCredito(double credito) {
      this.credito = credito;
    }

  }

  /**
   * Trabajador
   */
  static class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
      return salario;
    }

    public void setSalario(double salario) {
      this.salario = salario;
    }

  }

}
