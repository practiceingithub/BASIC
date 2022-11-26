package collectionframework;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


//arraylist store duplicate values
//arraylist maintain insertion order
//arraylist uses dynamic array to store the element
//arraylist grows or shrink  automatically by 50%
public class ArrayListDemo {
    public static void main(String[] args) {
List<String> list = new ArrayList<>();

        System.out.println(list);
        list.forEach(string-> System.out.println(string));
    }

}
