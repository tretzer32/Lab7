public class Sheep extends Animal{

    public Sheep(String kind, String name, int age, String breed){

        super(kind, name, age, breed);
    }

    @Override
    public void showVoice(){
        System.out.println("Bee!");
    }
}
