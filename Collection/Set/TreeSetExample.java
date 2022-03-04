package Collection.Set;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();

        //add
        set.add(10);
        set.add(-13);
        set.add(20);
        set.add(12);
        set.add(10);
        set.add(30);
        System.out.println("Set: " + set);

        //add multiple elements at a time
        set.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println("Set: " + set);

        //remove
        set.remove(-13);
        System.out.println("Set: " + set);

        //remove multiple elements at a time
        set.removeAll(Arrays.asList(12, 30));
        System.out.println("Set: " + set);

        //removing all element
        set.clear();
        System.out.println("Set: " + set);
    }
}
