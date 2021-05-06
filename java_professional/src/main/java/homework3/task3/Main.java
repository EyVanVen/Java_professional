package homework3.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HashMap<String , String> myHashMap = new HashMap<>();
        myHashMap.put("SCP", "173");
        myHashMap.put("Chaos", "Insurgency");

        System.out.println(myHashMap.get("SCP"));
        System.out.println(myHashMap.get("Chaos"));

        myHashMap.remove("SCP");

        System.out.println(myHashMap.get("SCP"));
    }

    public static class HashMap <Key, Value> {
        Object [] hashArr = new Object[10];

        public void put (Key key, Value val){
            hashArr[(key.hashCode() >> 2) % 10] = val;
        }

        public Value get (Key key){
            return (Value) hashArr[(key.hashCode() >> 2) % 10];
        }
        public void remove (Key key){
            hashArr[(key.hashCode() >> 2) % 10] = null;
        }

    }
}
