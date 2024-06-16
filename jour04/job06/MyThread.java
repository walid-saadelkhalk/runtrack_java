package jour04.job06;

import java.util.List;
import java.util.ArrayList;

public class MyThread implements Runnable {
    private int number;
    private List<Integer> list;

    public MyThread(int number) {
        this.number = number;
        this.list = new ArrayList<>();
    }

    public void run() {
        for (int i = 0; i < number; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
