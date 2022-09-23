package HW1;

public abstract class Vehicle extends Product{
    private String name;
private int qty;
private double price;
private Engine engine;
private float speed;
private final double TAX = 0.15;

    public Vehicle(String name, double price) {
        super(name, price);
    }


    public void Product(String name, double price) {


        this.name = name; this.price = price;
    }




    public double totalBeforeTax(Vehicle vehicle){
        return vehicle.getPrice();
    }

    public double calcTax(Vehicle vehicle){
       double tax = vehicle.getPrice() * TAX;
       return tax;
}
    
public void totalAfterTax(Vehicle vehicle){
        double tax = calcTax(vehicle);
        double totalBeforeTax = vehicle.getPrice();
        double amountAfterTax = tax + totalBeforeTax;
    System.out.println("Your total with tax is " + amountAfterTax);
}

    public void setNameSetPrice(String name, double price){
        setName(name); setPrice(price);
    }


    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double getTAX() {
        return TAX;
    }

}
