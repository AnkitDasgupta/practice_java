package p1;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {

    public static void main(String[] args) {


        TreeMap<Integer,String> n = new TreeMap<>();


        n.put(90,"Ajit");
        n.put(91,"Ankit");
        n.put(92,"Amit");
        n.put(93,"Amrit");
        n.put(88,"Amit");


        System.out.println(n.keySet());
        System.out.println(n.get(91));
        System.out.println(n.containsKey(92));

        for(int key : n.keySet()){

            System.out.println(n.get(key));
        }

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Apple");
        map.put(102,"Orange");
        map.put(103,"Banana");
        map.put(104,"Mango");

        System.out.println(map.keySet());
        System.out.println(map.get(101));
    }
}
