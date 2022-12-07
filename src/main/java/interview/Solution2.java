package interview;

import java.util.*;

/*
Finding common minimal value between two arrays
Example 1:
A = [1,3,5,7]
B = [2,3,4,5]
Return value should be 3

Example 2:
A = [1,2]
B = [0,0,0,1,1,2]
Return value should be 1

Example 3:
A = [0,3,0,0]
B = [1]
Return value should be -1
 */

public class Solution2 {
    public static int Solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int secondLength = B.length;
        int i = 0;
        for (int j : A) {
            while (i < secondLength - 1 && j > B[i])
                i++;
            if (j == B[i])
                return j;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int result;
        result = Solution(new int[] {1,3,5,7}, new int[] {2,3,4,5});
        System.out.println(result);
        result = Solution(new int[] {1,2}, new int[] {0,0,0,1,1,2});
        System.out.println(result);
        result = Solution(new int[] {0,3,0,0}, new int[] {1});
        System.out.println(result);
    }
}
