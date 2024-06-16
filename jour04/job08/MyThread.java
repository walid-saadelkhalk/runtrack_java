package jour04.job08;

public class MyThread implements Runnable{
    private long start;
    private long end;
    private long sum;

    public MyThread(long start, long end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            sum += i;
        }
    }
}
