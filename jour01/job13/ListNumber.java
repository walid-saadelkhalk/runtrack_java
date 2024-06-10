package jour01.job13;

class ListNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            System.out.print("Entrez un nombre : ");
            int number = sc.nextInt();
            for (int i = 1; i <= number; i++) {
                System.out.print(i + " ");
            }
        } finally {
            sc.close();
        }
    }
}
