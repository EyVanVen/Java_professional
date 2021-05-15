package homework13.task2;

public class Main extends Thread {
    public static void main(String[] args) {

        Thread first = new Thread(new Main(), "first");
        Thread second = new Thread(new Main(), "second");

        first.start();
        second.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main" + i);
        }
        //конкатенация сделана, чтоб уровнять последний вывод с потоками по времени
        System.out.println("Main:" + " finished");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        System.out.println(Thread.currentThread().getName() + ": finished");
    }
}