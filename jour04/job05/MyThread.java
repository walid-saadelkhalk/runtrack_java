package jour04.job05;

public class MyThread implements Runnable {
    private int start;
    private int end;
    private int count;

    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            count++;
        }
        System.out.println();
    }
}
