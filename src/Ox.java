public class Ox extends Animal{

    public Ox(String kind, String name, int age, String breed){

        super(kind, name, age, breed);
    }

    @Override
    public void showVoice(){
        System.out.println("Br...");
    }
}
