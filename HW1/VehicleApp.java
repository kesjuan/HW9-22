package HW1;

public class VehicleApp  {


    public static void printVehicleNamesAndPrices(Vehicle[] vehicle){
        for (int x = 0; x < vehicle.length; x++ ){
            System.out.print(vehicle[x].getName() + " ");
            System.out.println(vehicle[x].getPrice());
        }
    }




public static void getSpeedOfRideableObjects(IRideAble[] vehiclesThatImplementRideable){
        for (int x = 0; x < vehiclesThatImplementRideable.length; x++){
            System.out.println(vehiclesThatImplementRideable[x].milesPerHour() + " MPH");
        }

}



}
