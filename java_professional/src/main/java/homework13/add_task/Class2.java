package homework13.add_task;

public class Class2 extends Thread{
    public synchronized void count_loop () throws InterruptedException {
        for (int i = 0; i <= 10; i++){
            System.out.println("Class2:" + i);
            if (getPriority() == 1) {
                setPriority(9);
            }
            wait(1000);
        }

    }

    @Override
    public void run() {
        try {
            count_loop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
