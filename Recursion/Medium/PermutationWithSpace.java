package Recursion.Medium;

import java.util.ArrayList;

public class PermutationWithSpace {
    public static ArrayList<String> permutationWithSpaces(String S) {
        ArrayList<String> result = new ArrayList<>();
        //generatePermutations(S.charAt(0) + "", S.substring(1), result);
        generatePermutationsWithouSpace( "", S, result);
        return result;
    }

    private static void generatePermutationsWithouSpace(String current, String remaining, ArrayList<String> result) {
        if (remaining.isEmpty()) {
            result.add(current);
            return;
        }

        char c=remaining.charAt(0);
        for(int i=0;i<=current.length();i++){
            String s=current.substring(0,i);
            String f=current.substring(i);
            generatePermutationsWithouSpace(s+c+f,remaining.substring(1),result);
        }
    }

        private static void generatePermutations(String current, String remaining, ArrayList<String> result) {
        // Base case: if remaining string is empty, add the current permutation to the result
        if (remaining.isEmpty()) {
            result.add(current);
            return;
        }

        // Include the next character without space
        generatePermutations(current + remaining.charAt(0), remaining.substring(1), result);

        // Include the next character with space
        generatePermutations(current + " " + remaining.charAt(0), remaining.substring(1), result);
    }

    public static void main(String[] args) {
        String input = "ABC";
        ArrayList<String> permutations = permutationWithSpaces(input);
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
