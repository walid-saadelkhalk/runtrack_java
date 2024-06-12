package jour03.job08;
import java.util.Arrays;

public class TriMatrice {
    public static void main(String[] args){
        TriMatrice triMatrice = new TriMatrice();
        triMatrice.bidimensionnel();
    }
    
    // Fonction pour trier un tableau bidimensionnel en un tableau unidimensionnel et trier le tableau unidimensionnel
    public int[] unidimensionnel(){
        int [][] tableau = {{5,9,3},{7,2,8},{1,6,4}};

        int rows = tableau.length;
        int cols = tableau[0].length;
        int[] tableauUnidimensionnel = new int[rows * cols];

        int index = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                tableauUnidimensionnel[index++] = tableau[i][j];
            }
        }
        Arrays.sort(tableauUnidimensionnel);
        return tableauUnidimensionnel;
    }

    // Fonction pour recréer  et afficher le tableau bidimensionnel
    public void bidimensionnel(){
        int rows = 3;
        int cols = 3;
        int[] tableauUnidimensionnel = unidimensionnel();

        int[][] tableauBidimensionnel = new int[rows][cols];
        int index = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                tableauBidimensionnel[i][j] = tableauUnidimensionnel[index++];
            }
        }
        System.out.println(Arrays.deepToString(tableauBidimensionnel));
    }
}
