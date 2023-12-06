/**
 * The {@code Horse} class represents a specific type of animal - a horse.
 * It extends the abstract class {@link Animal} and inherits common attributes and methods.
 */
public class Horse extends Animal {

    /**
     * Constructs a {@code Horse} object with the specified characteristics.
     *
     * @param kind   The kind or type of the horse.
     * @param name   The name of the horse.
     * @param age    The age of the horse.
     * @param breed  The breed of the horse.
     */
    public Horse(String kind, String name, int age, String breed) {
        super(kind, name, age, breed);
    }

    /**
     * Overrides the abstract method in the superclass {@link Animal}.
     * Displays the characteristic sound or voice of a horse.
     */
    @Override
    public void showVoice() {
        System.out.println("Igo-go!");
    }
}
