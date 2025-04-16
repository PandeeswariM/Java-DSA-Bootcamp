package Arrays.Easy;

public class AddBinaryNumbers {

    static String addBinaryUtil(String a, String b)
    {
        String result = ""; // Initialize result
        int s = 0; // Initialize digit sum

        // Traverse both strings starting
        // from last characters
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1)
        {

            // Compute sum of last digits and carry
            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);

            // If current digit sum is 1 or 3,
            // add 1 to result
            result = s % 2 + result;

            // Compute carry
            s /= 2;

            // Move to next digits
            i--;
            j--;
        }
        return result;
    }

    // function to add n binary strings
    static String addBinary(String arr[], int n)
    {
        String result = "";
        for (int i = 0; i < n; i++)
        {
            result = addBinaryUtil(result, arr[i]);
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        String arr[] = {"1", "10", "11"};
        int n = arr.length;
        System.out.println(addBinary(arr, n));
    }
}
