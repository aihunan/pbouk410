public class Cat extends Animal {
    private int whiskerLength;

    public Cat(String name, int whiskerLength) {
        super(name); // Call the Animal constructor
        this.whiskerLength = whiskerLength;
    }

    @Override
    public void sound() {
        System.out.println("Kucing mengeong.");
    }

    public int getWhiskerLength() {
        return whiskerLength;
    }

    public void setWhiskerLength(int whiskerLength) {
        this.whiskerLength = whiskerLength;
    }
}