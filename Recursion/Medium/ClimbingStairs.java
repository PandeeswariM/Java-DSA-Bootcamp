package Recursion.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        return climbStairsHelper(n, new HashMap<>());
    }

    private static int climbStairsHelper(int n, Map<Integer, Integer> memo) {
        if (n <= 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int ways = climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2, memo);
        memo.put(n, ways);

        return ways;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
