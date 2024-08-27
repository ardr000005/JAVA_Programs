import java.util.Random;

class RandomNumberGenerator implements Runnable {
    private Random random;
    private int number;

    public RandomNumberGenerator() {
        random = new Random();
    }

    public void run() {
        number = random.nextInt(100); // Generate random number between 0 and 99
        System.out.println("Generated Random Number: " + number);

        if (number % 2 == 0) {
            synchronized (this) {
                Thread squareThread = new Thread(new SquareCalculator(number));
                squareThread.start();
                try {
                    squareThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            synchronized (this) {
                Thread cubeThread = new Thread(new CubeCalculator(number));
                cubeThread.start();
                try {
                    cubeThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class SquareCalculator implements Runnable {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class CubeCalculator implements Runnable {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

public class gpt {
    public static void main(String[] args) {
        Thread r1 = new Thread(new RandomNumberGenerator());
        Thread r2 = new Thread(new RandomNumberGenerator());
        Thread r3 = new Thread(new RandomNumberGenerator());
        Thread r4 = new Thread(new RandomNumberGenerator());

        r1.start();
        r2.start();
        r3.start();
        r4.start();
    }
}
