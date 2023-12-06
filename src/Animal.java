public abstract class Animal{
        String kind;
        String name;
        int age;
        String breed;

        public Animal(String kind, String name, int age, String breed){
            this.kind = kind;
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        public abstract void showVoice();

        public void displayInfo(){
            System.out.println("Тварина: " + kind);
            System.out.println("Ім'я тварини: " + name);
            System.out.println("Вік тварини: " + age);
            System.out.println("Порода тварини: " + breed);
        }
    }

