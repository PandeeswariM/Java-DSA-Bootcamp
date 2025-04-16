package Recursion.Medium;

public class DigitSum {
    public static void main(String[] args) {
        int sum=superDigit("9875",4);
        System.out.println(sum);
    }

    public static int superDigit(String n, int k) {
        int initialSum = 0;
        for (char ch : n.toCharArray()) {
            initialSum += Character.getNumericValue(ch);
        }
        initialSum *= k;
        return getSuperDigit(initialSum);
    }

    public static int getSuperDigit(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return getSuperDigit(sum);
    }
}
