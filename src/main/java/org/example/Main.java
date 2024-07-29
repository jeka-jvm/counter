package org.example;

import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Object[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Map<Object, Integer> result = ElementCounter.countToMap(array);

        System.out.println(result);
    }
}