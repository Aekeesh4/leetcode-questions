 class Solution {
    public static String largestOddNumber(String num) {
        int n = num.length();

        // Traverse from the end to find the rightmost odd digit
        for (int i = n - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {
                // Return substring from start to this odd digit
                return num.substring(0, i + 1);
            }
        }

        // No odd digit found
        return "";
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));     // Output: "5"
        System.out.println(largestOddNumber("4206"));   // Output: ""
        System.out.println(largestOddNumber("35427"));  // Output: "35427"
    }
}