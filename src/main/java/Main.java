import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * author
 * Michal
 * Bogusz
 **/

public class Main {
    public static void main(String[] args) {

        Phrases phrase = new Phrases();
        boolean win = false;
        List<String> usedLetters = new ArrayList<String>();

        System.out.println("<<Witamy w grze wisielec>>");
        System.out.println("<<Odgadnij hasło zanim rysunek zostanie dokonczony>>\n");
        //System.out.println("<<Sukane hasło:>>");
        String phraseString = phrase.getPharse();
        //System.out.println(phraseString);
        ArrayList phraseArray = Utils.convertToArray(phraseString);

        Scanner sc = new Scanner(System.in);
        String letter;
        int live = 7;
        Lose.showImage(live);

        do{

            System.out.println("Podaj jakąś litere lub podaj hasło");
            System.out.print("Użyte litery: ");
            for (int i = 0; i < usedLetters.size(); i++) {
                System.out.print(usedLetters.get(i)+", ");
            }
            System.out.println("\n");
            Utils.showBlankSpots(phraseArray);

            letter = sc.nextLine().toUpperCase();
            if(letter.length()==1){
                live=Lose.checkIn(live,letter,phraseString);
                System.out.println(live);
                Lose.showImage(live);
                win = Lose.checkLose(live,phraseString);
                phraseArray = Utils.checkLetter(phraseArray,phraseString,letter);
                usedLetters.add(letter.toUpperCase());


            }
            else {
                win = Utils.checkWin(letter,phraseString);
            }

        }while (!win);


    }
}
