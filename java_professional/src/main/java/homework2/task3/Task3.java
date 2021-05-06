package homework2.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList <Integer> ls = new LinkedList <>();

        System.out.println("Enter the size of list");

        int listSize = in.nextInt();

        Task3 t3= new Task3();
        t3.getIntegerList(ls, listSize);

        System.out.println(ls);

        System.out.println(t3.getMinimum(ls));
    }

    public List getIntegerList(List<Integer> list, int listSize){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < listSize; i++){
            System.out.println("Enter " + (i + 1) + " number.");
            list.add(in.nextInt());
        }
        return list;
    }

    public String getMinimum(List<Integer> list){
        Object [] arr = getArrCopy(list);
        Arrays.sort(arr);
        return "Minimum number is: " + (int)arr[0];
    }

     Object[] getArrCopy(List <Integer> list){
        return list.toArray();
    }
}
