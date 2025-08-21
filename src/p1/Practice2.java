package p1;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {

//        String s = "Ankit";
//
//        StringBuffer sb = new StringBuffer(s);
//            String i = String.valueOf(sb.reverse());
//        System.out.println(i);
//
//        StringBuilder sbb = new StringBuilder(s);
//
//        String j = String.valueOf(sbb.reverse());
//        System.out.println(j);

        List<Integer> a = new ArrayList();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(50);
        a.add(70);
        a.add(90);
//        System.out.println(a);
//
//        a.remove(3);
//        a.add(3,40);
//        System.out.println(a);
//        a.clear();
//        System.out.println(a);

        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i));
        }

    }
}
