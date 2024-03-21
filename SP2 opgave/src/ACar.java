public abstract class ACar implements Car {

    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;


    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;


    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getModel() {
        return model;

    }


    public String getMake() {
        return make;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }



    @Override
    public String toString() {
        return "Make: " + make + " Model: " + model + " RegistrationNumber: " + registrationNumber + " Numbers of doors:"
                + numberOfDoors;
    }
}
