package homework1.Array_list_and_iterrator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList <>();

        ListIterator <String> listItr = list.listIterator();

        list.add("6");
        list.add("Bla");
        list.add("Chaos");
        list.add("6");
        list.add("Doppio");
        list.add("XD");
        System.out.println(list);
        list.set(2, "Whiskas");
        System.out.println(list.get(2));
        list.remove(1);
        list.remove("6");
        System.out.println("Index of XD = " + list.indexOf("XD"));
        list.add(3, "Diavolo");
        System.out.println("Size = " + list.size());
        System.out.println(list); //toString is hidden

        Object [] objArray = list.toArray();
        list.clear();
        if(list.isEmpty()){
            System.out.println("This list is empty");
        } else {
            System.out.println("This list is not empty");
        }
        list.add("12");
        list.add("Grey");
        list.add("Flowy");

        System.out.println(list);

        if(listItr.hasNext()) {
            System.out.println(list.listIterator().next());
            System.out.println(listItr.hashCode());
        }

        System.out.println(listItr.previousIndex());
        System.out.println(listItr.hasPrevious());

    }
}
