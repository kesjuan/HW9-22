package HW2;

public class Monitor {
    private Resolution resolution;
    private String model;
    private String manufacturer;

    private String description = getModel() + getManufacturer() + getResolution();

    public Monitor(Resolution resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "HW2.Monitor{" +
                "resolution=" + resolution +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }


    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + "" + " in color " + color);
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
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
    public int getResoWidth(Monitor monitor){

        return resolution.getWidth();
    }

    public int getResoHeight(Monitor monitor){
        return resolution.getHeight();
    }
}
