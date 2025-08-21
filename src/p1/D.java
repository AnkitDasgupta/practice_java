package p1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class D {

    public static void main(String[] args) {

   List <Integer> num1 = List.of (77,44,33,66,88);


           List j =  num1.stream()
                   .sorted()
                     .collect(Collectors.toList());
        System.out.println(j);

        int [] num = {30,40,20,44,99,40,20};

        Arrays.stream(num)
                .distinct()
                .forEach(e-> System.out.println(e));

        //System.out.println(j);
    }
}