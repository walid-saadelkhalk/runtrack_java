package jour04.job06;

import java.util.Scanner;

public class ThreadProject {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            MyThread myRunnable = new MyThread(number);
            Thread thread = new Thread(myRunnable);
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
