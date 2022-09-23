package HW2;

public class PC {
    private Case case1;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case case1, Motherboard motherboard, Monitor monitor) {
        this.case1 = case1;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    private void drawLogo(){


        monitor.drawPixel(monitor.getResoWidth(monitor), monitor.getResoHeight(monitor), "Red");
                //drawPixel(x,y,z);
    }
    public void description(){
       String message = "Welcome to worst buy below is the description of the pc on sale today ";
        System.out.println(message+ "\n" + case1.getDescription() + " "+  monitor.getDescription() + " " + motherboard.getDescription());
    }
    public String description(PC pc){
        String message = "Welcome to worst buy below is the description of the pc on sale today ";
        return message+ "\n" + case1.getDescription() + " "+  monitor.getDescription() + " " + motherboard.getDescription();
    }
    public void powerUp(){
        case1.pressPowerButton();
        drawLogo();
        motherboard.loadProgram(" Mac");
    }

    @Override
    public String toString() {
        return "HW2.PC{" +
                "case1=" + case1 +
                ", motherboard=" + motherboard +
                ", monitor=" + monitor +
                '}';
    }
}
