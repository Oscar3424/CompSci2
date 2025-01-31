package Ex3_MusicFestival;

public class SmallStage extends Event{

    private int artNum;

    public SmallStage( String name, String type, int ArtNum){
        super(name,type);
        artNum = ArtNum;
    }

    public void printArtists(){
        System.out.println("The show features " + super.getEventName());

    }

    @Override
    public String toString() {
        return super.toString() + " SmallStage{" +
                "artNum=" + artNum +
                '}';
    }
}
