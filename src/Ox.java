/**
 * The {@code Ox} class represents a specific type of animal - an ox.
 * It extends the abstract class {@link Animal} and inherits common attributes and methods.
 */
public class Ox extends Animal {

    /**
     * Constructs an {@code Ox} object with the specified characteristics.
     *
     * @param kind   The kind or type of the ox.
     * @param name   The name of the ox.
     * @param age    The age of the ox.
     * @param breed  The breed of the ox.
     */
    public Ox(String kind, String name, int age, String breed) {
        super(kind, name, age, breed);
    }

    /**
     * Overrides the abstract method in the superclass {@link Animal}.
     * Displays the characteristic sound or voice of an ox.
     */
    @Override
    public void showVoice() {
        System.out.println("Br...");
    }
}
