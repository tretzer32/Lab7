import java.util.Scanner;

/**
 * This class represents a simple menu-driven program to display information about different animals.
 */
public class Main {

    /**
     * The main method that starts the program.
     *
     * @param args The command line arguments (not used in this program).
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Показати Собаку");
            System.out.println("2. Показати Кішку");
            System.out.println("3. Показати Вівцю");
            System.out.println("4. Показати Коня");
            System.out.println("5. Показати Вола");
            System.out.println("6. Вихід");
            System.out.print("Введіть ваш вибір: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showDog();
                case 2 -> showCat();
                case 3 -> showSheep();
                case 4 -> showHorse();
                case 5 -> showOx();
                case 6 -> System.out.println("Завершення програми. До побачення!");
                default -> System.out.println("Невірний вибір. Будь ласка, введіть правильну опцію.");
            }
        } while (choice != 6);

        scanner.close();
    }

    /**
     * Displays information about a dog.
     */
    private static void showDog() {
        Dog dog = new Dog("Собака", "Мухтар", 5, "Вівчарка");
        dog.displayInfo();
        dog.showVoice();
    }

    /**
     * Displays information about a cat.
     */
    private static void showCat() {
        Cat cat = new Cat("Кішка", "Люся", 2, "Звичайна");
        cat.displayInfo();
        cat.showVoice();
    }

    /**
     * Displays information about a sheep.
     */
    private static void showSheep() {
        Sheep sheep = new Sheep("Вівця", "Барбара", 4, "Звичайна");
        sheep.displayInfo();
        sheep.showVoice();
    }

    /**
     * Displays information about a horse.
     */
    private static void showHorse() {
        Horse horse = new Horse("Кінь", "Біляк", 9, "Британський");
        horse.displayInfo();
        horse.showVoice();
    }

    /**
     * Displays information about an ox.
     */
    private static void showOx() {
        Ox ox = new Ox("Віл", "Чорний", 12, "Український");
        ox.displayInfo();
        ox.showVoice();
    }
}
