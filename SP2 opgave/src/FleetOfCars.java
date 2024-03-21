import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();

FleetOfCars(){


}

void addCar(Car car){
    fleet.add(car);
}


int getTotalRegistrationFeeForFleet(){
    int totalFee = 0;
    for (Car car : fleet) {
        totalFee += car.getRegistrationFee();
    }
    return totalFee;
}


    @Override
    public String toString() {


        for (Car car: fleet){
            System.out.println(car);
        }

       return "Total-registration fee: " + getTotalRegistrationFeeForFleet();
    }
}
