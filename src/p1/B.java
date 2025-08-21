package p1;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class B {

    public static void main(String[] args) {

//        BinaryOperator<Integer> i = (x , y)-> x * y;
//      int l =  i.apply(5,8);
//        System.out.println(l);

List <Integer> l = List.of(2040,4008,8091,23463);
//
//              List<String> i =   l.stream()
//                         .map(t->t.toString())
//                      //.filter(f->f.endsWith("0"))
//                      .filter(t->t.startsWith("2"))
//                      .collect(Collectors.toList());
//
//        System.out.println(i);

         l.stream()
                .filter(r->r%2==0)
                .forEach(num-> System.out.println(num));


    }
}
