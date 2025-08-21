package p1;

public class A {

    public static void main(String[] args) {
        
        String str = "Ankit";
//
//
//        StringBuilder sb = new StringBuilder(str);
//        reversed = String.valueOf(sb.reverse());
//
//        System.out.println(reversed);
//
//        for(int i =1; i<str.length();i++) {
//
//            System.out.println(i);
//
//        }
//        for (int i=str.length()-1; i>=0; i--) {
//    reversed +=str.charAt(i);
//            System.out.print(reversed);
//        }
//    }

        for (int i = str.length()-1; i>=0; i--){

            System.out.print(str.charAt(i));
        }
    }
}
