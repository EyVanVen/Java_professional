package homework1.task1.ex_004_comparable.interface_comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 25, 5000);
        Animal bird = new Animal("King Penguin", 15, 25, 5000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);   // ClassCastException w/o Comparable

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
