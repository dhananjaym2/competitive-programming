
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int count = 1;
        for (int index = 0; index < A.length; index++) {
            System.out.println("index:" + index + " A[index]:" + A[index] + " count:" + count);
            if (A[index] < count) {
                if (index != 0 && A[index] != A[index - 1]) {
                    return count;
                }
            }
            if (A[index] >= 1 && index != 0 && A[index] != A[index - 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /*
         * Find the smallest positive integer that does not occur in a given sequence.
         */
        // sample test cases
        int[] testCase1 = { 1, 3, 6, 4, 1, 2 };// expected 5
        System.out.println(solution(testCase1));

        int[] testCase2 = { 1, 2, 3 };// expected 4
        System.out.println(solution(testCase2));

        int[] testCase3 = { -1, -3 };// expected 1
        System.out.println(solution(testCase3));
    }
}