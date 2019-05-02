/**
 * author
 * Michal
 * Bogusz
 **/

public class Lose {
    public static boolean checkLose(int live, String phraseString) {
        if(live==0){
            System.out.println("<<PRZEGRANA>>");
            System.out.println("<<Szukane hasło brzmiało: -="+phraseString+"=-");
            return true;
        }

        return false;
    }

    public static int checkIn(int live, String letter, String phraseString){
        boolean in = false;
        String stringLetter;
        for (int i = 0; i < phraseString.length(); i++) {
            stringLetter = String.valueOf(phraseString.charAt(i));
            if (letter.equals(stringLetter)) {
                in = true;
                break;
            }
        }
        if(in) return live;
        else return live-1;
    }

    public static void showImage(int i){
        switch (i){
            case 0:
                System.out.println(" -----------------");
                System.out.println("|      ______     |");
                System.out.println("|     ||     |    |");
                System.out.println("|     ||     O    |");
                System.out.println("|     ||    /|\\   |");
                System.out.println("|     ||    / \\   |");
                System.out.println("|    _||______    |");
                System.out.println("|  // ||      \\\\  |");
                System.out.println(" -----------------");
                break;
            case 1:
                System.out.println(" -----------------");
                System.out.println("|      ______     |");
                System.out.println("|     ||     |    |");
                System.out.println("|     ||     O    |");
                System.out.println("|     ||    /|\\   |");
                System.out.println("|     ||          |");
                System.out.println("|    _||______    |");
                System.out.println("|  // ||      \\\\  |");
                System.out.println(" -----------------");
                break;
            case 2:
                System.out.println(" -----------------");
                System.out.println("|      ______     |");
                System.out.println("|     ||     |    |");
                System.out.println("|     ||     O    |");
                System.out.println("|     ||          |");
                System.out.println("|     ||          |");
                System.out.println("|    _||______    |");
                System.out.println("|  // ||      \\\\  |");
                System.out.println(" -----------------");
                break;
            case 3:
                System.out.println(" -----------------");
                System.out.println("|      ______     |");
                System.out.println("|     ||          |");
                System.out.println("|     ||          |");
                System.out.println("|     ||          |");
                System.out.println("|     ||          |");
                System.out.println("|    _||______    |");
                System.out.println("|  // ||      \\\\  |");
                System.out.println(" -----------------");
                break;
            case 4:
                System.out.println(" -----------------");
                System.out.println("|                 |");
                System.out.println("|     ||          |");
                System.out.println("|     ||          |");
                System.out.println("|     ||          |");
                System.out.println("|     ||          |");
                System.out.println("|    _||______    |");
                System.out.println("|  // ||      \\\\  |");
                System.out.println(" -----------------");
                break;
            case 5:
                System.out.println(" -----------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|    _________    |");
                System.out.println("|  //         \\\\  |");
                System.out.println(" -----------------");
                break;
            case 6:
                System.out.println(" -----------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|  //         \\\\  |");
                System.out.println(" -----------------");
                break;
            case 7:System.out.println(" -----------------");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println("|                 |");
                System.out.println(" -----------------");
                break;
        }

    }
}
