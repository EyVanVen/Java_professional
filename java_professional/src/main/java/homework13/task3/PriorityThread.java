package homework13.task3;

public class PriorityThread extends Thread{
    public static void main(String[] args) {

        final int midPriority = MIN_PRIORITY*2;

        Thread one = new Thread(new PriorityThread(), "one");
        Thread two = new Thread(new PriorityThread(), "two");
        Thread three = new Thread(new PriorityThread(), "three");

        one.setPriority(MIN_PRIORITY);
        two.setPriority(MAX_PRIORITY);
        three.setPriority(midPriority);

        one.start();
        two.start();
        three.start();

        PriorityThread pt = new PriorityThread();

        pt.notifyAll();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        System.out.println(Thread.currentThread().getName() + ": finished");
    }
}
