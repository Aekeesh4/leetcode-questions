 class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare the prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    // Example usage
    public static void main(String[] args) {
        String[] input1 = {"flower", "flow", "flight"};
        System.out.println("Output: " + longestCommonPrefix(input1)); // Output: "fl"

        String[] input2 = {"dog", "racecar", "car"};
        System.out.println("Output: " + longestCommonPrefix(input2)); // Output: ""
    }
}