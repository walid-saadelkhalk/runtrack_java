package jour03.job07;

public class Matrice {
    public static void main(String[] args) {
        int[][] matrice1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [][] matrice2 = {{10,20,30}, {40,50,60}, {70,80,90}};
        
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] matrice3 = new int[matrice1.length][matrice1[0].length];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                matrice3[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        int total = 0;
        for (int i = 0; i < matrice3.length; i++) {
            for (int j = 0; j < matrice3[i].length; j++) {
                total += matrice3[i][j];
            }
        }
        System.out.println("Total: " + total);
    } 
}
