package homework14.task3;

public class Unlocking_wait {
    public static void main(String[] args) {
        Thread1wt th1 = new Thread1wt();
        Thread2wt th2 = new Thread2wt();

//        th1.setOtherThread(th2);
//        th2.setOtherThread(th1);

        th1.start();
        th2.start();
    }
}



class Thread1wt extends Thread {

//    private Thread thread2;

    static {
        System.out.println("1 has been created");
    }

//    public void setOtherThread (Thread thread2){
//        this.thread2 = thread2;
//    }

    @Override
    public synchronized void run() {
        System.out.println("Process started");
        System.out.println("1: Locking...");

        try {
            wait(1000);
            System.out.println("1: Unlocking...");
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("1: Unlocked");
    }
}

class Thread2wt extends Thread {

//    private Thread thread1;

    static {
        System.out.println("2 has been created");
    }

//    public void setOtherThread (Thread thread2){
//        this.thread1 = thread2;
//    }

    @Override
    public synchronized void run() {
        System.out.println("Process started");

        System.out.println("2: Locking...");
        try {
            wait(1000);
            System.out.println("2: Unlocking...");
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("2: Unlocked...");
    }
}

