import java.util.ArrayList;

public class Propietario {
    private String nombre;
    private String apellido;
    private ArrayList<Vehiculo> tipo_vehiculo;

    public Propietario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_vehiculo = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if(vehiculo instanceof Automovil) {
            Automovil auto = (Automovil) vehiculo;
            tipo_vehiculo.add(auto);
        }
        if(vehiculo instanceof Motocicleta){
            Motocicleta moto = (Motocicleta) vehiculo;
            tipo_vehiculo.add(moto);
        }
    }

    public void mostrarInformacionPropietario(){
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido);
        System.out.println(" ");
        if(!tipo_vehiculo.isEmpty()) {
            System.out.println("Datos de sus vehiculos");
            for (int i = 0; i < tipo_vehiculo.size(); i++) {
                if(tipo_vehiculo.get(i) instanceof Automovil){
                    System.out.println(" ");
                    System.out.println("Lista de Autos");
                    ((Automovil) tipo_vehiculo.get(i)).mostrarInformacionAutomovil();
                }

                if(tipo_vehiculo.get(i) instanceof Motocicleta){
                    System.out.println(" ");
                    System.out.println("Lista de Motos");
                    ((Motocicleta) tipo_vehiculo.get(i)).mostrarInformacionMotocicleta();
                }

            }
        }else{
            System.out.println("no tiene vehiculos a su nombre");
        }


    }
}
