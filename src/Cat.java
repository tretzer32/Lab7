public class Cat extends Animal{

    public Cat(String kind, String name, int age, String breed){

        super(kind, name, age, breed);
    }

    @Override
    public void showVoice(){
        System.out.println("Meow!");
    }
}