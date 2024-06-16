package jour04.job07;

public class MyThread implements Runnable {

    private int[] array;
    private int start;
    private int end;
    private int sum;

    public MyThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        System.out.println("Sum from " + start + " to " + (end-1) + " is: " + sum);
    }
}
