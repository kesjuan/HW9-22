package HW1;

public class Horse extends Vehicle implements IRideAble{

    public Horse(String name, double price) {
        super(name, price);
    }

    @Override
    public int milesPerHour() {
        return 30;
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
