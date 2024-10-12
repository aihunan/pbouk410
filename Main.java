public class Main {
    public static void main(String[] args) {
        // Create objects from the classes
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Sunny", 1);

        // Call methods on the objects
        System.out.println("Suara hewan: ");
        animal.sound();
        dog.sound();
        cat.sound();
        bird.sound();

        // Use polymorphism to call the same method on different objects
        System.out.println("\nSuara hewan dengan polymorphism: ");
        makeSound(animal);
        makeSound(dog);
        makeSound(cat);
        makeSound(bird);

        // Akses dan ubah data dengan setter dan getter
        System.out.println("\nNama hewan: " + animal.getName());
        animal.setName("Hewan baru");
        System.out.println("Nama hewan setelah diubah: " + animal.getName());

        System.out.println("\nUmur anjing: " + dog.getAge());
        dog.setAge(4);
        System.out.println("Umur anjing setelah diubah: " + dog.getAge());

        System.out.println("\nPanjang bulu kucing: " + cat.getWhiskerLength());
        cat.setWhiskerLength(3);
        System.out.println("Panjang bulu kucing setelah diubah: " + cat.getWhiskerLength());

        System.out.println("\nRentang sayap burung: " + bird.getWingSpan());
        bird.setWingSpan(2);
        System.out.println("Rentang sayap burung setelah diubah: " + bird.getWingSpan());
    }

    public static void makeSound(Animal hewan) {
        hewan.sound();
    }
}