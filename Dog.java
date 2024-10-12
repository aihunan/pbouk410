public class Dog extends Animal {
    private int age;

    public Dog(String name, int age) {
        super(name); // Call the Animal constructor
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Anjing menggonggong.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}