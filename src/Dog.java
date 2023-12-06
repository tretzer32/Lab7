public class Dog extends Animal{

    public Dog(String kind, String name, int age, String breed){

        super(kind, name, age, breed);
    }

    @Override
    public void showVoice(){
        System.out.println("Haw!");
    }
}
