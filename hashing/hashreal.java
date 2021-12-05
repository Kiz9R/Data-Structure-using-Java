package hashing;

import java.util.*;

public class hashreal {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        HashSet<Integer> in = new HashSet<Integer>();
        in.add(1);
        in.add(20);
        for (int i : in) {
            System.out.println(i + " ");
        }
        h.add("Ritankar");
        h.add("bucha");
        h.add("Debnath");
        System.out.println(h.size());
        for (String s : h) {
            System.out.println(s + " ");
        }
        System.out.println(h.isEmpty());
        System.out.println(h.remove("bucha"));
        for (String s : h) {
            System.out.println(s + " ");
        }
        System.out.println(h.contains("Ritankar"));
        System.out.println(h.contains("Deb"));
    }
}
