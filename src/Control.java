import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Control {

    private String userSelection() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj porę roku:");
        System.out.println(Arrays.toString(Season.getSeasonsTranslated()));
        String userChoice = scan.nextLine();
        return userChoice;
    }

    public void printMonths(HashMap<Season, String[]> maps) {
        Season season1 = Season.convertFromString(userSelection());
        System.out.println("Miesiące należące do tego sezonu:");
        String[] miesiace = maps.get(season1);
        System.out.println(Arrays.toString(miesiace));
    }

}
