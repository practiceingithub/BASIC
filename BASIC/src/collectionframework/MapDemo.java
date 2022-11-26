package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("pune" , 10);
        map.put("Nashik" , 20);
        map.put("Mumbai" , 30);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());



        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });


        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(132, "James");
        map1.put(256, "Amy");
        map1.put(115, "Young");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "bio");
        map2.put(2, "maths");
       map2.put(3, "english");

        List<Map<Integer, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);

        list.forEach(l ->{
            l.forEach((k,v) ->{
                System.out.println(k+" "+v);
            });
        });


    }
}
