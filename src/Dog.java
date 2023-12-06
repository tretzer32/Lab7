/**
 * The {@code Dog} class represents a specific type of animal - a dog.
 * It extends the abstract class {@link Animal} and inherits common attributes and methods.
 */
public class Dog extends Animal {

    /**
     * Constructs a {@code Dog} object with the specified characteristics.
     *
     * @param kind   The kind or type of the dog.
     * @param name   The name of the dog.
     * @param age    The age of the dog.
     * @param breed  The breed of the dog.
     */
    public Dog(String kind, String name, int age, String breed) {
        super(kind, name, age, breed);
    }

    /**
     * Overrides the abstract method in the superclass {@link Animal}.
     * Displays the characteristic sound or voice of a dog.
     */
    @Override
    public void showVoice() {
        System.out.println("Haw!");
    }
}
