public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        Car c1 = new DieselCar("Z3R077", "BMW", "X7",4 , true, 801);
        Car c2 = new GasolineCar("G0LF21", "Golf 7", "1.5 TSi highline", 4, 590);
        Car c3 = new ElectricCar("XEO210", "Audi", "Q8 e-tron", 4, 390, 560);

       fleet.addCar(c1);
       fleet.addCar(c2);
       fleet.addCar(c3);

        System.out.println(fleet);
        System.out.println();

    }
}