package Recursion;

public class ReduceToZero {
    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

//    Given an integer num, return the number of steps to reduce it to zero.
//    In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

    public static int numberOfSteps(int num) {
      if(num==0){
          return 0;
      }

      return (num&1)==0?1+numberOfSteps(num/2):1+numberOfSteps(num-1);
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
