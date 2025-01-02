package Ex3_MusicFestival;

public class FoodTruck extends NonMusicEvent{

    private int amount;

    public FoodTruck(String name, String type, String loc, int a){
        super(name, type,loc);
        super.setLocation(loc);
        amount = a;
    }

    public void printServings(){
        System.out.println("The amount of food available is " + amount);
    }

    @Override
    public String toString() {
        return super.toString() + " FoodTruck{" +
                "amount=" + amount +
                '}';
    }
}
