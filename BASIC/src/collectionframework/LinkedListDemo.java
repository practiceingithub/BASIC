package collectionframework;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

//linked list store duplicate value
//linked list maintain insertion order
//linked list uses doubly linked list to store the element
//
public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        list.add(3);

        list.add(4);
        System.out.println(list);
    }
}
