package NoD;

public class Concesionario {
    private Vehiculo vehiculo;

    public Concesionario() {
        vehiculo = new Vehiculo();
    }

    public void venderMoto() {
        System.out.println("Vendiendo moto...");
        vehiculo = new Moto();
        vehiculo.acelerar();
        vehiculo.frenar();
    }

    public void venderCoche() {
        System.out.println("Vendiendo coche...");
        vehiculo = new Coche();
        vehiculo.acelerar();
        vehiculo.frenar();
    }

}
