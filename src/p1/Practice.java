package p1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        String s1 = "Hello world";
//
//        for (int i = s1.length() - 1; i >= 0; i--) {
//
//            System.out.print(s1.charAt(i));
//
//        }
//        System.out.println("          ");
//        Practice p = new Practice();
//     int j =   p.Sum(40,60);
//        System.out.println(j);
//
//    }
//    public int Sum(int x , int y){
//
//        return x+y;

//      String s = "ankita";
//
//        System.out.println(s.toUpperCase());
//
//          Long a = s.chars()
//                  .filter(e->e=='a')
//                  .count();
//        System.out.println("Total no of 'a' is  --> "+a);
//
//        List<Integer> num = List.of(20,40,69,10,5,20,40,88,44,200);
//
//         List<Integer> k = num.stream()
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(k);
//
//                List j = num.stream()
//                        .distinct()
//                        .collect(Collectors.toList());
//        System.out.println(j);

        int[] num = {60, 20, 10, 80, 44, 66};

        System.out.println(test(num));

    }
    public static int test(int[] num){

        int largestNo = Integer.MIN_VALUE;
        int secondMaxNo = Integer.MIN_VALUE;

        for(int num1 : num){

            if(num1>largestNo){

                   secondMaxNo = largestNo;
                   largestNo = num1;

            } else if (num1>secondMaxNo && num1 != largestNo) {

                secondMaxNo = num1;

            }


        }
        return secondMaxNo;
    }
}