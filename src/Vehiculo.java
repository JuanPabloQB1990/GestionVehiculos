public class Vehiculo {
    private int ruedas;
    private String marca;
    private String modelo;

    public Vehiculo(int ruedas, String marca, String modelo) {
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String obtenerInformacionVehiculo() {
        return "ruedas: " + ruedas + " marca: " + marca + " modelo: " + modelo;
    }


}
