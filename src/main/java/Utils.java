import java.util.ArrayList;

/**
 * author
 * Michal
 * Bogusz
 **/

public class Utils {

    public static ArrayList convertToArray (String toConvert){
       ArrayList<String> arrayList = new ArrayList<String>();
       String empty;
        for (int i = 0; i < toConvert.length(); i++) {
            empty = String.valueOf(toConvert.charAt(i));
            if(empty.equals(" ")) arrayList.add("   ");
            else arrayList.add(" ");
        }
        return arrayList;
    }

    public static void showBlankSpots(ArrayList phrese){
        int size = phrese.size();
        System.out.print(" ");
        for (int i = 0; i < size; i++) {
            if("   ".equals(phrese.get(i))){
                System.out.print("    ");
            }else System.out.print("--- ");
        }
        System.out.print("\n");
        System.out.print("|");
        for (int i = 0; i < size; i++) {
            if("   ".equals(phrese.get(i))){
                System.out.print(phrese.get(i)+"|");
            }else System.out.print(" "+phrese.get(i)+" |");
        }
        System.out.print("\n");
        System.out.print(" ");
        for (int i = 0; i < size; i++) {
            if("   ".equals(phrese.get(i))){
                System.out.print("    ");
            }else System.out.print("--- ");
        }
        System.out.print("\n");
    }

    public static ArrayList checkLetter(ArrayList phraseArray, String phraseString, String letter){
        String stringLetter;
        for (int i = 0; i < phraseArray.size(); i++) {
            stringLetter = String.valueOf(phraseString.charAt(i));
            if(letter.equals(stringLetter))
                phraseArray.set(i,letter);
        }
        return phraseArray;
    }

    public static boolean checkWin(String letter, String phraseString) {
        if(letter.equals(phraseString)){
            System.out.println("<<Hasło to: -="+phraseString+"=-");
            System.out.println("<<WYGRANA>>");
            return true;
        }else{
            System.out.println("<<Błędne hasło, próbuj dalej>>\n");
            return false;
        }

    }
}
