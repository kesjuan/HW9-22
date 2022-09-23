package HW1;

public class Bike extends Vehicle implements IRideAble {


    public Bike(String name, double price) {
        super(name, price);
    }

    @Override
    public int milesPerHour() {
        return 10;
    }

    @Override
    public double totalBeforeTax(Vehicle vehicle) {
        return super.totalBeforeTax(vehicle);
    }

    @Override
    public double calcTax(Vehicle vehicle) {
        return super.calcTax(vehicle);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        super.totalAfterTax(vehicle);
    }
}
