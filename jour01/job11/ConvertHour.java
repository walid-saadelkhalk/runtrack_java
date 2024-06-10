package jour01.job11;

class ConvertHour {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            System.out.print("Entrez la durée en minutes : ");
            int minutes = sc.nextInt();
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            System.out.println(minutes + " minutes équivalent à " + hours + " heures et " + remainingMinutes + " minutes.");

        } finally {
            sc.close();
        }
    }
}
