package homework1.kata;

import java.util.*;


public class Kata_task {
    public static Double[] sortItOut(Double[] array) {
        int odds_counter = 0;
        int evens_counter = 0;

        int even_index = 0;
        int odd_index = 0;

        for(int i = 0;  i < array.length; i++){

            if (Math.floor(array[i]) % 2  ==  0){
                evens_counter++;
            }
            else {
                odds_counter++;
            }
        }

        Double [] odds_arr = new Double[odds_counter];
        Double [] evens_arr = new Double[evens_counter];

        for(int i = 0;  i < array.length; i++){

            Math.floor(array[i]);

            if (Math.floor(array[i]) % 2 ==  0){
                evens_arr[even_index] = array[i];
                even_index++;
            }
            else {
                odds_arr[odd_index] = array[i];
                odd_index++;
            }
        }

        Arrays.sort(odds_arr);

        Arrays.sort(evens_arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(odds_arr));
        System.out.println(Arrays.toString(evens_arr));

        System.arraycopy(odds_arr, 0, array, 0, odds_arr.length);
        System.arraycopy(evens_arr, 0, array, odds_arr.length, evens_arr.length);


        return array;
    }

    public static void main(String[] args) {

        Double[] array = new Double[] {1.7, 7.8, 13.0, 13.5, 17.5, 18.5, 32.5, 36.8, 56.2, 58.5, 78.7, 79.1, 79.3, 88.2, 94.5, 86.0, 34.0};

        System.out.println(Arrays.toString(sortItOut(array)));
    }
}

