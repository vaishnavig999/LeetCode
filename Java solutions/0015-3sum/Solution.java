import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {
    /**
     * Finds all unique triplets in the array nums such that a + b + c = 0.
     * 
     * @param nums The input array of integers.
     * @return A list of lists containing all unique triplets that sum to zero.
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                if (total == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (total < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        // Example test case 1: Given in the problem statement
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = solution.threeSum(nums1);
        System.out.println("Test Case 1:");
        for (List<Integer> triplet : result1) {
            System.out.println(triplet);
        }
        System.out.println();

        // Example test case 2: Edge case with no triplets that sum to zero
        int[] nums2 = {1, 2, 3, 4, 5};
        List<List<Integer>> result2 = solution.threeSum(nums2);
        System.out.println("Test Case 2:");
        for (List<Integer> triplet : result2) {
            System.out.println(triplet);
        }
        System.out.println();

        // Example test case 3: Edge case with all zeros
        int[] nums3 = {0, 0, 0, 0};
        List<List<Integer>> result3 = solution.threeSum(nums3);
        System.out.println("Test Case 3:");
        for (List<Integer> triplet : result3) {
            System.out.println(triplet);
        }
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
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
        */

        scanner.close();
    }
}
