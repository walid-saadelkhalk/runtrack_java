package jour04.job05;

import java.util.Scanner;

public class ThreadProject {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a maximum number: ");
            int maxNumber = input.nextInt();

            int midPoint = maxNumber / 2;

            MyThread firstHalf = new MyThread(0, midPoint);
            MyThread secondHalf = new MyThread(midPoint + 1, maxNumber);

            Thread thread1 = new Thread(firstHalf);
            Thread thread2 = new Thread(secondHalf);

            long startTime = System.currentTimeMillis();
            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();

            int totalCount = firstHalf.getCount() + secondHalf.getCount();
            long executeTime = endTime - startTime;

            System.out.println("Total count: " + totalCount);
            System.out.println("Execution time: " + executeTime + "ms");
        }
    }
}
