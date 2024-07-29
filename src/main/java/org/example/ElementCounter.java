package org.example;

import java.util.HashMap;
import java.util.Map;


public class ElementCounter {

    public static Map<Object, Integer> countToMap(Object[] array) {
        Map<Object, Integer> result = new HashMap<>();
        for (Object element : array) {
            if (result.containsKey(element)) {
                result.put(element, result.get(element) + 1);
            } else {
                result.put(element, 1);
            }
        }
        return result;
    }

}
