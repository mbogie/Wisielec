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
        phrases.add("KOCHAM CIĘ");
        phrases.add("SPIDERMAN");
        phrases.add("CO MI ZROBISZ JAK MNIE ZŁAPIESZ");
        phrases.add("LOVE ROSIE");
        phrases.add("TERMINATOR");
        phrases.add("COCA COLA");
        phrases.add("GOŚĆ W DOM BÓG W DOM");
        phrases.add("JAK PIES Z KOTEM");
        phrases.add("MONA LISA");
        phrases.add("MONTE CARLO");
        phrases.add("PRZEMINEŁO Z WIATREM");
        phrases.add("JOHN TRAVOLTA");
        phrases.add("SALMA HAYEK");
        phrases.add("MADONNA");
        phrases.add("CZTERDZIESTU ROZBÓJNIKÓW");
        phrases.add("CZTERY WESELA I POGRZEB");



    }
    private String pickOne(){
        return phrases.get(random.nextInt(phrases.size()));
    }

    public Phrases() {
        addPharses();
        phrase = pickOne();
    }

    public String getPharse() {
        return phrase;
    }
}
