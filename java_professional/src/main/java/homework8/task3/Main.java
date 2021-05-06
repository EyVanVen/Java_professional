package homework8.task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Class1 cl1 = new Class1();
        Class2 cl2 = new Class2();
        Class3 cl3 = new Class3();

        int [] arr3 = cl3.createRandArray(9);
        System.out.println(Arrays.toString(arr3));
        int [] arr2 = cl2.createRandArray(15);
        System.out.println(Arrays.toString(arr2));
        int [] arr1 = cl1.createRandArray(10);
        System.out.println(Arrays.toString(arr1));


    }
}
