public class ElectricCar extends ACar {


  int batteryCapacity;
  int maxRange;

  ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange){
      super(registrationNumber, make, model, numberOfDoors);

      this.batteryCapacity = batteryCapacity;
      this.maxRange = maxRange;


  }


    public int getBatteryCapacity() {
        return batteryCapacity;
    }



    public int getMaxRangeKm() {
        return maxRange;
    }


    public int getWhPrKm(){
        int n = 91;
       int konvertWH = batteryCapacity /n /100;


        if (batteryCapacity> 50){
            return 0;
        } else if (batteryCapacity <= 20) {
            return 330;
        } else if (batteryCapacity >= 15) {
            return 1050;
        } else if (batteryCapacity >=10) {
            return 2340;
        } else if (batteryCapacity >= 5) {
            return 5500;
        }else{
            return 10470;

        }
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
    public String toString() {
        return super.toString() + " Wh Pr km: " + getWhPrKm() + " BatteryCapaci "+ getBatteryCapacity() + " MaxRange: "+getMaxRangeKm();
    }
}
