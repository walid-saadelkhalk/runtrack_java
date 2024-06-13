package jour04.job02;

import java.util.List;

public class ThreadProject {
        public static void main(String[] args) {
        MyThread thread = new MyThread();
        List<Character> generatedList = thread.generateList();

        long startTime = System.currentTimeMillis();
        thread.writeInFile(generatedList);
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        System.out.println("Execution time: " + executeTime  + "ms");
    }
}
