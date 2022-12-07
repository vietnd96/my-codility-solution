package interview;/*
Max Inserts to Obtain String Without 3 Consecutive 'v'
Given a string S, returns the maximum number of letters a that can be inserted into S (including at the front and end of S) so that the resulting string doesn’t contain three consecutive letters 'v'. If string S already contains the substring 'vvv', then your function should return -1.

Example 1:
Input: vi
Output: 3
Explanation:
A string "vvivv" can be made

Example 3:
Input: vv
Output: 0
Explanation:
No longer string can be made.

Example 4:
Input: vbvvvvb
Output: -1
Explanation:
There is a substring "vvv"

 */

public class Solution1 {
    public static int Solution(String S) {
        char c = 'v';
        S = S.toLowerCase();
        int numberOfA = 0;
        int numberOfNotA = 0;
        int sumOfNumberOfAExisting = 0;
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == c) {
                sumOfNumberOfAExisting += 1;
                numberOfA += 1;
            } else if (numberOfA < 3) {
                numberOfNotA += 1;
                numberOfA = 0;
            }
        }
        if(numberOfA >= 3)
            return -1;
        else {
            int numberOfAShouldBePresent = 2 * (numberOfNotA + 1);
            return numberOfAShouldBePresent - sumOfNumberOfAExisting;
        }
    }

    public static void main(String[] args) throws Exception {
        int result;
        result = Solution("vvbvb");
        System.out.println(result);
        result = Solution("ngd");
        System.out.println(result);
        result = Solution("vv");
        System.out.println(result);
        result = Solution("bvvvv");
        System.out.println(result);
        //My extra tests
        result = Solution("");
        System.out.println(result);
        result = Solution("v");
        System.out.println(result);
        result = Solution("vb");
        System.out.println(result);
        result = Solution("bvbvbbv");
        System.out.println(result);
        result = Solution("vbvbvbbvv");
        System.out.println(result);
        result = Solution("vbvvvvb");
        System.out.println(result);
    }
}
