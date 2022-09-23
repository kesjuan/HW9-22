package HW1;

public class Truck extends Vehicle implements IRideAble{
    public Truck(String name, double price) {
        super(name, price);
    }

    @Override
    public int milesPerHour() {
        return 100;
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
