package hashing;

import java.util.*;

public class hashreal2 {
    public static void main(String[] args) {
        HashMap<String, Integer> s = new HashMap<String, Integer>();
        s.put("Ritankar", 20);
        s.put("Bucha", 19);
        System.out.println(s.size());
        System.out.println(s);
        for (Map.Entry<String, Integer> e : s.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
