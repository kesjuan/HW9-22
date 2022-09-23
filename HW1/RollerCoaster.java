package HW1;

public class RollerCoaster implements IRideAble{
    private String name;
    private double price;
    private final double TAX = 0.20;
    public void setNameSetPrice(String name, double price){
        setName(name); setPrice(price);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int milesPerHour() {
        return 400;
    }

    public double getTAX() {
        return TAX;
    }
    public double totalBeforeTax(RollerCoaster rollerCoaster) {
        return getPrice();
    }
    public double calcTax(RollerCoaster rollerCoaster){
        double tax = rollerCoaster.getPrice() * TAX;
        return tax;
    }

    public void totalAfterTax(RollerCoaster rollerCoaster){
        double tax = calcTax(rollerCoaster);
        double totalBeforeTax = rollerCoaster.getPrice();
        double amountAfterTax = tax + totalBeforeTax;
        System.out.println("Your total with tax is " + amountAfterTax);
    }

}
