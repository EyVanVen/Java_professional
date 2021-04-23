package homework3.task2;

import java.util.*;

public class FamilyCity {
    public static void main(String[] args) {
        HashMap <String, String> familyMap = new HashMap<>();

        String city = "Москва";

        familyMap.put("Москва", "Ивановы");
        familyMap.put("Киев", "Петровы");
        familyMap.put("Лондон", "Абрамовичи");

        System.out.println(familyMap);

        System.out.println(familyMap.get("Лондон"));
        System.out.println(familyMap.get("Киев"));
        System.out.println(familyMap.get("Москва"));
        System.out.println(familyMap.get(city));
    }
}
