package HW2;

public class Case {
    private String model, manufacturer, powerSupply;
    private Dimensions dimensions;
    private String description = getManufacturer() + getModel() + getDimensions() + getPowerSupply();

    @Override
    public String toString() {
        return "HW2.Case{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println(getPowerSupply() + " is plugged in" );
        System.out.println("PowerButton pressed");
    }
}
