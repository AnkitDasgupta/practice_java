//give an integer array nums,find the contiguous subarray (containing at least one number) which has the largest product and the retuen product.

package p1;

public class MaxProductSubarray {



        public int maxProduct(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }


            int max_so_far = nums[0];

            int min_so_far = nums[0];

            int result = nums[0];


            for (int i = 1; i < nums.length; i++) {
                int current_num = nums[i];


                int temp_max = Math.max(current_num, Math.max(max_so_far * current_num, min_so_far * current_num));

                min_so_far = Math.min(current_num, Math.min(max_so_far * current_num, min_so_far * current_num));

                max_so_far = temp_max;


                result = Math.max(result, max_so_far);
            }

            return result;
        }

        public static void main(String[] args) {
            MaxProductSubarray solution = new MaxProductSubarray();


            int[] nums1 = {2, 3, -2, 4};
            System.out.println("Max product for {2, 3, -2, 4}: " + solution.maxProduct(nums1));

            int[] nums2 = {-2, 0, -1};
            System.out.println("Max product for {-2, 0, -1}: " + solution.maxProduct(nums2));

            int[] nums3 = {-2, 3, -4};
            System.out.println("Max product for {-2, 3, -4}: " + solution.maxProduct(nums3));

            int[] nums4 = {0, 2};
            System.out.println("Max product for {0, 2}: " + solution.maxProduct(nums4));

            int[] nums5 = {-1, -2, -9, -6};
            System.out.println("Max product for {-1, -2, -9, -6}: " + solution.maxProduct(nums5));

            int[] nums6 = {7, -2, -4};
            System.out.println("Max product for {7, -2, -4}: " + solution.maxProduct(nums6));
        }
    }

