public class Bird extends Animal {
    private int wingSpan;

    public Bird(String name, int wingSpan) {
        super(name); // Call the Animal constructor
        this.wingSpan = wingSpan;
    }

    @Override
    public void sound() {
        System.out.println("Burung berkicau.");
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
}