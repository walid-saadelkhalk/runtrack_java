package jour03.job04;

import java.util.HashMap;
import java.util.Map;

public class TableauOccurence {
    public static void main(String[] args) {
        int[] tab = {3, 7, 3, 9, 8};
        Map<Integer, Integer> occurrences = new HashMap<>();
        
        for (int i = 0; i < tab.length; i++) {
            if (occurrences.containsKey(tab[i])) {
                occurrences.put(tab[i], occurrences.get(tab[i]) + 1);
            } else {
                occurrences.put(tab[i], 1);
            }
        }
        System.out.println("Occurences des valeurs dans le tableau :"+ occurrences);
    }
}
