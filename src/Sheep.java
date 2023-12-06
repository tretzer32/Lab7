/**
 * The {@code Sheep} class represents a specific type of animal - a sheep.
 * It extends the abstract class {@link Animal} and inherits common attributes and methods.
 */
public class Sheep extends Animal {

    /**
     * Constructs a {@code Sheep} object with the specified characteristics.
     *
     * @param kind   The kind or type of the sheep.
     * @param name   The name of the sheep.
     * @param age    The age of the sheep.
     * @param breed  The breed of the sheep.
     */
    public Sheep(String kind, String name, int age, String breed) {
        super(kind, name, age, breed);
    }

    /**
     * Overrides the abstract method in the superclass {@link Animal}.
     * Displays the characteristic sound or voice of a sheep.
     */
    @Override
    public void showVoice() {
        System.out.println("Bee!");
    }
}
