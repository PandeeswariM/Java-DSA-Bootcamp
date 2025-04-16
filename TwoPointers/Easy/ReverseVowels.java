package TwoPointers.Easy;

public class ReverseVowels {

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            // Move left pointer to the next vowel
            while (left < right && "aeiouAEIOU".indexOf(chars[left]) != -1) {
                left++;
            }

            // Move right pointer to the previous vowel
            while (left < right && "aeiouAEIOU".indexOf(chars[right]) != -1) {
                right--;
            }

            // Swap the vowels at left and right
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move both pointers inward
            left++;
            right--;
        }
        return new String(chars); // Convert char array back to string
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCream"));
    }
}
