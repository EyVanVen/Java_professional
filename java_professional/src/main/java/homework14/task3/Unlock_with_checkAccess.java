package homework14.task3;

public class Unlock_with_checkAccess {
    public static void main(String[] args) {
        Thread1n th1 = new Thread1n();
        Thread2n th2 = new Thread2n();

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
    public synchronized void run() {
        System.out.println("Process started");
        System.out.println("1: Locking...");

        try {
            System.out.println("1: Unlocking...");
            thread2.join(1000);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("1: Unlocked");
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
    public synchronized void run() {
        System.out.println("Process started");

        System.out.println("2: Locking...");
        try {
            System.out.println("2: Unlocking...");
            thread1.checkAccess();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("2: Unlocked...");
    }
}

