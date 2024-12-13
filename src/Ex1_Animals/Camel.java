package Ex1_Animals;

public class Camel extends Animal{

    int numHumps;

    public Camel( String name, int h){
        super(name);
        numHumps = h;
        name = "Bobby";
    }

    public void talk(){
        System.out.println(name + " is an camel that says \"neoooaahy\"");
    }

}



