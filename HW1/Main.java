package HW1;

public class Main  {
    public static void main(String[] args) {
      Vehicle car = new Car("Honda", 1500);
      Vehicle truck = new Truck("Ford", 4000.00);
      Bike bike = new Bike("Trek", 200.00);
      RollerCoaster rollerCoaster = new RollerCoaster();

      car.setNameSetPrice("Honda", 1500.00);
      truck.setNameSetPrice("Ford", 4000.00);
      bike.setNameSetPrice("Trek", 200.00);
      rollerCoaster.setNameSetPrice("Kingda Ka", 10000.00);

      Vehicle[] vehicles = new Vehicle[] {car, truck, bike};
      Horse horse = new Horse("Horsey", 5000);
      horse.setNameSetPrice("horsey", 5000.00);
      IRideAble[] rideAble = new IRideAble[] {bike,horse,rollerCoaster};
      VehicleApp.printVehicleNamesAndPrices(vehicles);
      VehicleApp.getSpeedOfRideableObjects(rideAble);

      System.out.println(horse.totalBeforeTax(horse));
      System.out.println(horse.calcTax(horse));
      horse.totalAfterTax(horse);
      System.out.println(rollerCoaster.totalBeforeTax(rollerCoaster));
      rollerCoaster.totalAfterTax(rollerCoaster);
      System.out.println(rollerCoaster.calcTax(rollerCoaster));
      for(int x = 0; x < vehicles.length; x++){
        vehicles[x].totalAfterTax(vehicles[x]);
      }
    }
}
