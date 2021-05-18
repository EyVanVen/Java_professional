package homework14.task2;

public class Deadlock_main {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

        th1.setOtherThread(th2);
        th2.setOtherThread(th1);

        th1.start();
        th2.start();
    }
}

class Thread1 extends Thread {

    private Thread thread2;

    static {
        System.out.println("1 has been created");
    }

    public void setOtherThread (Thread thread2){
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        System.out.println("Process started");

        try {
            System.out.println("1: Locking...");
            thread2.join();
            System.out.println("1: Unlocking...");
        } catch (Exception e){
            System.out.println("1: Unlocked");
        }
    }
}

class Thread2 extends Thread {

    private Thread thread1;

    static {
        System.out.println("2 has been created");
    }

    public void setOtherThread (Thread thread2){
        this.thread1 = thread2;
    }

    @Override
    public void run() {
        System.out.println("Process started");

        try {
            System.out.println("2: Locking...");
            thread1.join();
            System.out.println("2: Unlocking...");
        } catch (Exception e){
            System.out.println("2: Unlocked...");
        }
    }
}
