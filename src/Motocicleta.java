public class Motocicleta extends Vehiculo implements Conducible{
    private int cilindraje;
    private String tipo_manejo;

    public Motocicleta(int ruedas, String marca, String modelo, int cilindraje, String tipo_manejo) {
        super(ruedas, marca, modelo);
        this.cilindraje = cilindraje;
        this.tipo_manejo = tipo_manejo;
    }

    @Override
    public String conducir() {
        return "la motocicleta se encuentra en movimiento";
    }

    public void mostrarInformacionMotocicleta(){
        System.out.println(obtenerInformacionVehiculo() + " cilindraje: " + cilindraje + " tipo de manejo: " + tipo_manejo);
    }
}
