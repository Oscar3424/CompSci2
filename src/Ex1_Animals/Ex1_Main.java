package Ex1_Animals;

import java.util.ArrayList;
public class Ex1_Main {

    public static void run(){

        ArrayList<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(new Animal("Peppy") );
        allAnimals.add( new Dog("Scout") );
        allAnimals.add(new Rotweiller( "Rubble" ));
        allAnimals.add( new Shihtzu("Bubbles"));
        allAnimals.add (new Trout( "Slippery" ));
        allAnimals.add(new Camel("Sandy",4));

        System.out.println("What does the dogs say?");
        for (int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i) instanceof Dog) {
                allAnimals.get(i).talk();
            }
        }

        allAnimals.get(5).talk();

        Animal a = new Rotweiller("Mean old doggie");
//        Rotweiller b = new Animal("Jason was wrong");
        a.talk();


    }
}
