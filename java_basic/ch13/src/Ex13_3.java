import java.util.TreeMap;

public class Ex13_3 {

    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx3_1 th1 = new ThreadEx3_1();
        th1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i = i + 1)
            System.out.printf("%s", new String("-"));

        System.out.println("소요시간1:" + (System.currentTimeMillis()));
    }
}

class ThreadEx3_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i = i + 1)
            System.out.printf("%s", new String("|"));

        System.out.println("소요시간2:" + (System.currentTimeMillis()));
    }
}