package Arrays.Medium;

import java.util.*;

public class MajorityVote {

    public static List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        //we can use Boyer-Moore Voting Algorithm (also known as the Moore Majority Voting Algorithm) for finding elements that appear more than n/3 times in an array.
        int n = nums.size();
        int candidate1 = -1, candidate2 = -1, count1 = 0, count2 = 0;

        // First phase: Find the two potential candidates
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second phase: Count the actual occurrences of candidate1 and candidate2
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        // Collect the results
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) {
            result.add(candidate1);
        }
        if (count2 > n / 3) {
            result.add(candidate2);
        }

        // If no candidate has more than n/3 votes, return -1
        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2); list.add(3); list.add(5);
        //list.add(5); list.add(5); list.add(5); list.add(6); list.add(6); list.add(6); list.add(6); list.add(6);
        System.out.println(findMajority(list));
    }
}
