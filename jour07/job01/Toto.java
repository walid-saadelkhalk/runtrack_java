package jour07.job01;

class Toto {
    int  toto = 0;
    Toto() {
        toto = toto + 1;
    }
    public static void main(String[] args) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        // System.out.println("Toto: " + toto);
        /*
         * Erreur de compilation car toto est une variable non statique 
         * et ne peut pas être utilisée dans un contexte statique
         */
        System.out.println("Toto: " + t1.toto);
        System.out.println("Toto: " + t2.toto);
    }
}