public class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char char1 = s.charAt(i);
            char char2 = s.charAt(i + 1);

            score += Math.abs(char1 - char2);
        }
        
        return score;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "cases";
        System.out.println("Score of '" + s1 + "': " + solution.scoreOfString(s1)); // Output: 48

        String s2 = "abbc";
        System.out.println("Score of '" + s2 + "': " + solution.scoreOfString(s2)); // Output: 50

        // Edge cases
        String s3 = "a";
        System.out.println("Score of '" + s3 + "': " + solution.scoreOfString(s3)); // Output: 0

        String s4 = "abc";
        System.out.println("Score of '" + s4 + "': " + solution.scoreOfString(s4)); // Output: 2

        String s5 = "bbbb";
        System.out.println("Score of '" + s5 + "': " + solution.scoreOfString(s5)); // Output: 0
    }
}
