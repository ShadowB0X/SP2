public class GasolineCar extends AFuelCar {
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
       return "Gasoline";
    }

    @Override
    public int kmPrLitre() {
        return 0;
    }


    @Override
    public String GetMake() {
        return make;
    }

    @Override
    public int getRegistrationFee() {
        if (getKmPrLitre() > 50) {
            return 0;
        } else if (getKmPrLitre() <= 20) {
            return 330;
        } else if (getKmPrLitre() >= 15) {
            return 1050;
        } else if (getKmPrLitre() >= 10) {
            return 2340;
        } else if (getKmPrLitre() >= 5) {
            return 5500;
        } else {
            return 10470;


        }

    }


    @Override
    public String toString() {
        return super.toString() + " Fueltype: " + getFuelType() + " KM PR Litre: " +getKmPrLitre();
    }
}


