import java.util.*;

class odd implements Runnable {
    private int m;

    public odd(int n) {
        m = n;
    }

    public synchronized void run() {
        System.out.println("This is odd");
        System.out.println((m * m * m));
    }
}

class even implements Runnable {
    private int m1;

    public even(int n) {
        m1 = n;
    }

    public synchronized void run() {
        System.out.println("This is even");
        System.out.println((m1 * m1));
    }
}

class generator implements Runnable {
    private Random r;
    private int n;

    public generator() {
        r = new Random();
    }

    public void run() {
        synchronized(generator.class) {
            n = r.nextInt(100);
            System.out.println("This is the random number: " + n);

            if ((n % 2) == 0) {
                even e = new even(n);
                Thread th1 = new Thread(e);
                th1.start();
            } else {
                odd o = new odd(n);
                Thread th2 = new Thread(o);
                th2.start();
            }
        }
    }
}

class DemoI {
    public static void main(String args[]) {
        generator g1 = new generator();
        generator g2 = new generator();
        generator g3 = new generator();
        generator g4 = new generator();

        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g2);
        Thread t3 = new Thread(g3);
        Thread t4 = new Thread(g4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
