package jour03.job05;

import java.util.HashMap;
import java.util.Map;

public class ValeurUnique {
    
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
        System.out.println("Valeurs uniques dans le tableau :");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == 1) { 
                System.out.println(entry.getKey());
            }
        }
    }
}
