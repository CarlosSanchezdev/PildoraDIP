package D;

public class Concesionario {
    private Vehiculo vehiculo;

    public Concesionario(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void vender() {
        System.out.println("Vendiendo vehículo...");
        vehiculo.acelerar();
        vehiculo.frenar();
    }
}
