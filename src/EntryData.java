import java.util.HashMap;

public class EntryData {

    HashMap<Season, String[]> getData() {
        HashMap<Season, String[]> seasonsMap = new HashMap<>();
        seasonsMap.put(Season.SPRING, new String[]{"Marzec", "Kwiecień", "Maj"});
        seasonsMap.put(Season.SUMMER, new String[]{"Czerwiec", "Lipiec", "Sierpień"});
        seasonsMap.put(Season.AUTUMN, new String[]{"Wrzesień", "Październik", "Listopad"});
        seasonsMap.put(Season.WINTER, new String[]{"Grudzień", "Styczeń", "Luty"});
        return seasonsMap;
    }
}
