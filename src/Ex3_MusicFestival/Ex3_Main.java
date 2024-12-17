package Ex3_MusicFestival;
import java.util.ArrayList;

public class Ex3_Main {

    public static void run(){


        ArrayList<Event> allEvents = new ArrayList<>();

        allEvents.add(new MainStageEvent("Walk off the Earth","music"));
        allEvents.add(new MainStageEvent("Hemple Temple","music"));
        allEvents.add(new MainStageEvent("Singer1","music"));
        allEvents.add(new MainStageEvent("Singer2","music"));
        allEvents.add(new MainStageEvent("Magician","magic"));

        allEvents.add(new FoodTruck("Noodles","food","Tent 4",130));
        allEvents.add(new FoodTruck("Curry","food","Tent 2",190));
        allEvents.add(new FoodTruck("Apples","food","Tent 3",109));
        allEvents.add(new FoodTruck("Kabobs","food","Tent 1",176));
        allEvents.add(new FoodTruck("Tofu","food","Tent 5",235));

        allEvents.add(new SmallStage("The singers","music",4));
        allEvents.add(new SmallStage("The beatles","music",9));
        allEvents.add(new SmallStage("Comp Sci singers","music",7));
        allEvents.add(new SmallStage("Vanish","magic",4));
        allEvents.add(new SmallStage("Three musketeers","play",3));


        ((MainStageEvent)allEvents.get(1)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(1)).addTech("Symphony Orchestra");

        for (int i = 0; i < allEvents.size(); i++) {

            System.out.println(allEvents.get(i).getEventName());
            if(allEvents.get(i) instanceof MainStageEvent) {
                ((MainStageEvent) allEvents.get(i)).printTech();
            }
        }

        while (true) {

            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1   Add new event");
            System.out.println("2.  Search for event");
            System.out.println("3.  Filter by event type");
            System.out.println("4.  Plant a crop");
            System.out.println("5.  Save and Exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1){
                System.out.println("What event?");
                String answer = Library.input.nextLine();
                if(answer.contains("Main")){
                    System.out.println("What is the name?");
                    String answer1 = Library.input.nextLine();
                    System.out.println("What type");
                    String answer2 = Library.input.nextLine();
                    allEvents.add(new MainStageEvent(answer1,answer2));
                } else if(answer.contains("Small")){
                    System.out.println("What is the name?");
                    String answer1 = Library.input.nextLine();
                    System.out.println("What type");
                    String answer2 = Library.input.nextLine();
                    System.out.println("How many artists");
                    int answer3 = Library.input.nextInt();
                    allEvents.add(new SmallStage(answer1,answer2,answer3));

                } else{
                    System.out.println("What is the name?");
                    String answer1 = Library.input.nextLine();
                    System.out.println("What type?");
                    String answer2 = Library.input.nextLine();
                    System.out.println("Which location?");
                    String answer3 = Library.input.nextLine();
                    System.out.println("How many servings?");
                    int answer4 = Library.input.nextInt();
                    allEvents.add(new FoodTruck(answer1,answer2,answer3,answer4));
                }
            }
            if(choice == 2){
                System.out.println("What event?");
                String searchTerm = Library.input.nextLine();
                boolean yes = false;
                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i).equals(searchTerm)){
                        System.out.println(allEvents.get(i).toString());
                    }
                }

            }
        }

    }//run

}//Ex3_Main
