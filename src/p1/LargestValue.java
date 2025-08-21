package p1;

public class LargestValue {

    public static int test(int []a){
        int largestNo = Integer.MIN_VALUE; //-5433256776
        for(int num : a){
            if(num>largestNo){

                largestNo=num;
            }
        }
        return largestNo;

    }

    public static void main(String[] args) {

        int [] a = {20,3000,60,120,400,80000};

        System.out.println(test(a));
    }


}
