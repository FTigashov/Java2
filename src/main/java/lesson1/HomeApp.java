package lesson1;

import java.util.*;

public class HomeApp {
    public static void main(String[] args) {
        String[] words = {"hello", "say", "hi", "finish", "hi", "some", "close", "say", "hello", "say", "close", "finish", "hello"};


        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);

        Catalog catalog = new Catalog();

        catalog.add("Иванов", "911");
        catalog.add("Иванов", "112");
        catalog.add("Иванов", "003");
        catalog.add("Васильев", "968");
        catalog.add("Васильев", "912");
        catalog.add("Петров", "926");

        System.out.println(catalog.getLastName("Иванов"));
        System.out.println(catalog.getLastName("Васильев"));
        System.out.println(catalog.getLastName("Петров"));
    }
}

class Catalog {
    private Map<String, HashSet<String>> map;

    Catalog() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phoneNumber) {
        HashSet<String> numbers;

        if(map.containsKey(lastName)) numbers = map.get(lastName);
        else numbers = new HashSet<>();

        numbers.add(phoneNumber);
        map.put(lastName, numbers);
    }

    Set<String> getLastName(String lastName) {
        return map.get(lastName);
    }
}
