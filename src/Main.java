// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil(4, "Chevrolet", "2020", 4, TipoCombustible.Gasolina);
        Motocicleta moto = new Motocicleta(2, "Honda", "2018", 150, "Sport");
        Propietario juan = new Propietario("Juan", "Quintero");


        juan.mostrarInformacionPropietario();
        juan.agregarVehiculo(auto);
        juan.agregarVehiculo(moto);

        juan.mostrarInformacionPropietario();
    }
}