package collectionframework;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);

        list.add(30);

        list.add(40);

        list.add(50);

        list.add(60);

        System.out.println(list);
        System.out.println(list.capacity());
        System.out.println(list.contains(30));
        System.out.println(list.firstElement());
        System.out.println(list.lastElement());
        System.out.println(list.isEmpty());
        System.out.println(list.subList(1,4));
        System.out.println(list);


        Iterator<Integer>iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        Iterator<Integer>iterator1 = list.listIterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println();


    }
}
