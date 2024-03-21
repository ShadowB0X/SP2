public class DieselCar extends AFuelCar{
    int kmPrLitre;
    boolean particleFilter;
    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, boolean particleFilter, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors,kmPrLitre );
        this.particleFilter = particleFilter;
    }

    @Override
    public String GetMake() {
        return null;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int kmPrLitre() {
        return kmPrLitre;
    }


    public boolean isParticleFilter() {
        return particleFilter;
    }


    @Override
    public String toString() {
        return super.toString() + " FuelType: "+getFuelType() + " KM per litre: "+getKmPrLitre();
    }
}
