/**
 * The abstract class {@code Animal} represents a general concept of an animal.
 * It provides common attributes such as kind, name, age, and breed for all animals.
 */
public abstract class Animal {

    /** The kind or type of the animal (e.g., Dog, Cat). */
    String kind;

    /** The name of the animal. */
    String name;

    /** The age of the animal. */
    int age;

    /** The breed of the animal. */
    String breed;

    /**
     * Constructs an {@code Animal} object with the specified characteristics.
     *
     * @param kind   The kind or type of the animal.
     * @param name   The name of the animal.
     * @param age    The age of the animal.
     * @param breed  The breed of the animal.
     */
    public Animal(String kind, String name, int age, String breed) {
        this.kind = kind;
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    /**
     * Abstract method to be implemented by subclasses.
     * Displays the sound or voice of the animal.
     */
    public abstract void showVoice();

    /**
     * Displays general information about the animal, including kind, name, age, and breed.
     */
    public void displayInfo() {
        System.out.println("Тварина: " + kind);
        System.out.println("Ім'я тварини: " + name);
        System.out.println("Вік тварини: " + age);
        System.out.println("Порода тварини: " + breed);
    }
}
