package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax:
        List<Integer> list = new ArrayList<Integer>();

        //is list empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is empty? : " + isEmpty);

        //adding data to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 40);
        list.add(10);
        list.add(100);
        list.add(10);
        System.out.println("List after adding: " + list);

        //list.add(5, 50); -> will throw exception

        //index of 30
        int index = list.indexOf(30);
        System.out.println("Index of 30 in the list: " + index);

        //last index of 10
        int lastIndex = list.lastIndexOf(10);
        System.out.println("Last index of 10 in the list: " + lastIndex);

        //get data from the list
        int data;
        data = list.get(2);
        System.out.println("Element at index 2: " + data);

        //updating the data
        list.set(1, 400);
        System.out.println("List after updating: " + list);

        //contains
        boolean isPresent = list.contains(400);
        System.out.println("Is 400 Present?: " + isPresent);

        isPresent = list.contains(500);
        System.out.println("Is 500 Present?: " + isPresent);

        //remove an element
        list.remove(1); //remove an element at the given index
        System.out.println("List after removing element at index 1: " + list);

        Integer temp = 20;
        list.remove(temp);
        System.out.println("List after removing 20: " + list);

        //size of the list
        int size = list.size();
        System.out.println("Size: " + size);

        isEmpty = list.isEmpty();
        System.out.println("Is empty? : " + isEmpty);

        list.clear();
        System.out.println("List after clear(): " + list);

        isEmpty = list.isEmpty();
        System.out.println("Is empty? : " + isEmpty);
    }
}
