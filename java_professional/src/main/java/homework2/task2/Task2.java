package homework2.task2;

import java.util.*;

public class Task2{
    public static void main(String[] args) {

        PriorityQueue <Integer> prq = new PriorityQueue<>(Comparator.naturalOrder());

        for (int i = 0; i <= 10; i++){
            prq.add((int) (Math.random() * 100));
        }
        System.out.println(prq);

        while (!prq.isEmpty()){
            System.out.println(prq.poll());
        }

    }
}
