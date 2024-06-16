package jour04.job04;

public class MyThread implements Runnable {
    private int number;

    public MyThread(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
