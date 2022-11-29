import java.util.*;

/*
Imagine on x-axis and y-axis there are some points which has location (X,Y)
Identify the minimum number of roads parallel to Y-axis which has width = W that covers all points

Example 1:
X = [0,2,5,8]
Y = [1,3,4,8]
W = 2
Return value should be 3 - details: (0,0)-(2,0); (5,0)-(7,0); (8,0)-(10,10)

Example 2:
X = [2,5,6,8]
Y = [0,2,3,1]
W = 3
Return value should be 2 - details: (2,0)-(5,0); (6,0)-(9,0)
 */

public class Solution3 {
    public static int Solution(int[] X, int[] Y, int W) {
        if(X.length == 0) return 0;
        Arrays.sort(X);
        int numberOfPath = 1;
        int startIndex = X[0];
        for (int x : X) {
            int pathRange = startIndex + W;
            if(x > pathRange) {
                numberOfPath += 1;
                startIndex = x;
            }
        }
        return numberOfPath;
    }

    public static void main(String[] args) throws Exception {
        int result;
        result = Solution(new int[] {0,2,5,8}, new int[] {1,3,4,8}, 2);
        System.out.println(result);
        result = Solution(new int[] {2,5,6,8}, new int[] {0,2,3,1}, 3);
        System.out.println(result);
    }
}
