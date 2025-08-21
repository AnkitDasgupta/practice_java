package p1;


    public class SecondLargestEasy {
        public static int findSecondLargest(int[] arr) {
//            if (arr.length < 2) return -1;
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            return secondLargest;
        }

        public static void main(String[] args) {
            int[] numbers = {10,120, 20,200, 5, 12,30,80};
            System.out.println("Second Largest: " + findSecondLargest(numbers)); // Output: 120
        }
    }




