import java.util.Scanner;

public class Main {
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

    private static void showDog() {
        Dog dog = new Dog("Собака", "Мухтар", 5, "Вівчарка");
        dog.displayInfo();
        dog.showVoice();
    }
    private static void showCat() {
        Dog dog = new Dog("Кішка", "Люся", 2, "Звичайна");
        dog.displayInfo();
        dog.showVoice();
    }
    private static void showSheep() {
        Dog dog = new Dog("Вівця", "Барбара", 4, "Звичайна");
        dog.displayInfo();
        dog.showVoice();
    }
    private static void showHorse() {
        Dog dog = new Dog("Кінь", "Біляк", 9, "Британський");
        dog.displayInfo();
        dog.showVoice();
    }

    private static void showOx() {
        Dog dog = new Dog("Віл", "Чорний", 12, "Український");
        dog.displayInfo();
        dog.showVoice();
    }
}