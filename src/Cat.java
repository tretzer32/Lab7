/**
 * The {@code Cat} class represents a specific type of animal - a cat.
 * It extends the abstract class {@link Animal} and inherits common attributes and methods.
 */
public class Cat extends Animal {

    /**
     * Constructs a {@code Cat} object with the specified characteristics.
     *
     * @param kind   The kind or type of the cat.
     * @param name   The name of the cat.
     * @param age    The age of the cat.
     * @param breed  The breed of the cat.
     */
    public Cat(String kind, String name, int age, String breed) {
        super(kind, name, age, breed);
    }

    /**
     * Overrides the abstract method in the superclass {@link Animal}.
     * Displays the characteristic sound or voice of a cat.
     */
    @Override
    public void showVoice() {
        System.out.println("Meow!");
    }
}
