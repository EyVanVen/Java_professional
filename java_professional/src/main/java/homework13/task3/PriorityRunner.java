package homework13.task3;

public class PriorityRunner implements Runnable{

    public static void main(String[] args) {
         final int MAX_PRIORITY = 10;
         final int MIN_PRIORITY = 1;

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
    }

    @Override
    public void run() {
        notifyAll();
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        System.out.println(Thread.currentThread().getName() + ": finished");
    }
}
