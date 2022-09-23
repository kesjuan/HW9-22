package HW2;

public class Main {
    public static void main(String[] args) {

PC pc = new PC(new Case(), new Motherboard(), new Monitor(new Resolution(5,10)) );
        String object3 = pc.description(pc);
       pc.description();
       pc.powerUp();

    }
}
