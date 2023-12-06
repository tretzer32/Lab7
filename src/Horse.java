public class Horse extends Animal{

    public Horse(String kind, String name, int age, String breed){

        super(kind, name, age, breed);
    }

    @Override
    public void showVoice(){
        System.out.println("Igo-go!");
    }
}
