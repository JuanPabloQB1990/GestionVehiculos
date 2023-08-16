public class Automovil extends Vehiculo implements Conducible{
    private int numero_puertas;
    private TipoCombustible tipo_combustible;
    public Automovil(int ruedas, String marca, String modelo, int numero_puertas, TipoCombustible tipo_combustible) {
        super(ruedas, marca, modelo);
        this.numero_puertas = numero_puertas;
        this.tipo_combustible = tipo_combustible;
    }


    @Override
    public String conducir() {
        return "el auto se encuentra en movimiento";
    }

    public void mostrarInformacionAutomovil(){
        System.out.println(obtenerInformacionVehiculo() + " No puertas: " + numero_puertas + " tipo combustible: " + tipo_combustible );
    }
}
