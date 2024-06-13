package jour04.job03;

public class ThreadProject {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        
        MyThread myThread = new MyThread();
        int length = myThread.input();
        String generatedString = myThread.generateString(length);

        int mid = length / 2;

        Thread writerThread1 = new Thread(() -> myThread.writeToFile(generatedString, 0, mid, "jour04/job03/output.txt"));
        Thread writerThread2 = new Thread(() -> myThread.writeToFile(generatedString, mid, length, "jour04/job03/output.txt"));

        writerThread1.start();
        writerThread2.start();

        try {
            writerThread1.join();
            writerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Temps d'exécution : " + executionTime + " ms");
        // Le temps d'exécution est plus long que la version séquentielle car les deux threads écrivent dans le même fichier en même temps, ce qui peut causer des conflits.
    }
}
