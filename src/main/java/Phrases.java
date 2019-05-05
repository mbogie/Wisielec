import java.util.ArrayList;
import java.util.Random;

/**
 * author
 * Michal
 * Bogusz
 **/

public class Phrases {

    private ArrayList<String> phrases = new ArrayList<String>();
    Random random = new Random();
    private String phrase;

    private void addPharses(){
        phrases.add("I LOVE YOU");
        phrases.add("SPIDERMAN");
        phrases.add("CATCH ME IF YOU CAN");
        phrases.add("LOVE ROSIE");
        phrases.add("TERMINATOR");
        phrases.add("COCA COLA");
        phrases.add("ESCAPE FROM LOS ANGELES");
        phrases.add("JAK PIES Z KOTEM");
        phrases.add("MONA LISA");
        phrases.add("MONTE CARLO");
        phrases.add("GO WITH THE WIND");
        phrases.add("JOHN TRAVOLTA");
        phrases.add("SALMA HAYEK");
        phrases.add("MADONNA");
        phrases.add("FAST AND FURIOUS");
        phrases.add("FOUR WEDDINGS AND A FUNERAL");



    }
    private String pickOne(){

        return phrases.get(random.nextInt(phrases.size()));
    }

    public Phrases() {
        addPharses();
        this.phrase = pickOne();
    }

    public String getPharse() {
        return phrase;
    }
}
