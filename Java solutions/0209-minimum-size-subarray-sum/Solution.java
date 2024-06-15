import java.util.Scanner;

class Solution {
    /**
     * Finds the minimum length of a contiguous subarray of which the sum is at least target.
     * 
     * @param target The target sum.
     * @param nums   The input array of integers.
     * @return The minimum length of the contiguous subarray. Returns 0 if no such subarray exists.
     */
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int minLen = Integer.MAX_VALUE;
        int left = 0, sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right]; 

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        // Example test case 1: Given in the problem statement
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        // Expected output: 2
        System.out.println("Test Case 1:");
        System.out.println("Minimum length of subarray for target " + target1 + ": " + solution.minSubArrayLen(target1, nums1));
        System.out.println();

        // Example test case 2: Edge case with empty array
        int[] nums2 = {};
        int target2 = 5;
        // Expected output: 0
        System.out.println("Test Case 2:");
        System.out.println("Minimum length of subarray for target " + target2 + ": " + solution.minSubArrayLen(target2, nums2));
        System.out.println();

        // Example test case 3: Edge case with all negative numbers
        int[] nums3 = {-1, -2, -3, -4, -5};
        int target3 = -9;
        // Expected output: 4
        System.out.println("Test Case 3:");
        System.out.println("Minimum length of subarray for target " + target3 + ": " + solution.minSubArrayLen(target3, nums3));
        System.out.println();

        // User input test case: Uncomment to test with user input
        /*
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum (target): ");
        int target = scanner.nextInt();
        System.out.println("Minimum length of subarray for target " + target + ": " + solution.minSubArrayLen(target, nums));
        */

        scanner.close();
    }
}
