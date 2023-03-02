package D;

public class Main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario(new Moto());
        concesionario.vender();
        concesionario.setVehiculo(new Coche());
        concesionario.vender();
    }
}