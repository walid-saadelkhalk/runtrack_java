package jour04.job07;

import java.util.Scanner;

public class ThreadProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        int mid = n / 2;

        MyThread firstHalf = new MyThread(array, 0, mid);
        MyThread secondHalf = new MyThread(array, mid, n);

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

        int totalSum = firstHalf.getSum() + secondHalf.getSum();
        long executeTime = endTime - startTime;

        System.out.println("Total sum: " + totalSum);
        System.out.println("Execution time: " + executeTime + "ms");

        input.close();
    }
}
