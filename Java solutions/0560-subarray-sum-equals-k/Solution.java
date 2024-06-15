import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    /**
     * Calculates the number of subarrays that sum up to the target value k.
     * 
     * @param nums The input array of integers.
     * @param k    The target sum value.
     * @return The number of subarrays that sum to k.
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> sumFreq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                count++;
            }
            if (sumFreq.containsKey(sum - k)) {
                count += sumFreq.get(sum - k);
            }
            sumFreq.put(sum, sumFreq.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        // Example test case 1: Basic case
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        // Expected output: 2
        System.out.println("Number of subarrays summing to " + k1 + ": " + solution.subarraySum(nums1, k1));

        // Example test case 2: Negative numbers
        int[] nums2 = {3, 4, 7, 2, -3, 1, 4, 2};
        int k2 = 7;
        // Expected output: 4
        System.out.println("Number of subarrays summing to " + k2 + ": " + solution.subarraySum(nums2, k2));

        // Example test case 3: Edge case with empty array
        int[] nums3 = {};
        int k3 = 5;
        // Expected output: 0
        System.out.println("Number of subarrays summing to " + k3 + ": " + solution.subarraySum(nums3, k3));

        // User input test case: Uncomment and test with user input
        /*
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum (k): ");
        int k = scanner.nextInt();
        System.out.println("Number of subarrays summing to " + k + ": " + solution.subarraySum(nums, k));
        */

        scanner.close();
    }
}
