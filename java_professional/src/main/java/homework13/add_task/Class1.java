package homework13.add_task;

public class Class1 extends Thread{

    public synchronized void count_loop (String name) throws InterruptedException {
        for (int i = 0; i <= 10; i++){
            System.out.println("Class1: " + i);
            wait(1000);
        }

    }

    @Override
    public void run() {
        try {
            count_loop(currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
