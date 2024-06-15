import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital){
        int n = profits.length;

        // Create an array of indexes and sort by capital
        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, (a, b) -> Integer.compare(capital[a], capital[b]));

        // Create Max-heap for profits
        PriorityQueue<Integer> maxProfitHeap = new PriorityQueue<>((a, b) -> profits[b] - profits[a]);

        int currentIndex = 0;
        for (int i = 0; i < k; i++) {

            //Add projects to maxProfitHeap based on capital
            while (currentIndex < n && capital[indexes[currentIndex]] <= w) {
                maxProfitHeap.add(indexes[currentIndex]);
                currentIndex++;
            }

            // No project found
            if (maxProfitHeap.isEmpty()) {
                break;
            }

            // Select project with greatest profit
            w += profits[maxProfitHeap.poll()];
        }

        return w;
    }
    public static void main(String[] args) {
        int k1 = 2;
        int w1 = 0;
        int[] profits1 = {1, 2, 3};
        int[] capital1 = {0, 1, 1};
        System.out.println(findMaximizedCapital(k1, w1, profits1, capital1));

        int k2 = 3;
        int w2 = 0;
        int[] profits2 = {1, 2, 3};
        int[] capital2 = {0, 1, 2};
        System.out.println(findMaximizedCapital(k2, w2, profits2, capital2));
    }
}
