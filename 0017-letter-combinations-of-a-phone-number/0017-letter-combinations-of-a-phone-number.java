class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        return pad("", digits);
    }

    private List<String> pad(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        String letters = mapping[digit];
        List<String> result = new ArrayList<>();

        for (char ch : letters.toCharArray()) {
            result.addAll(pad(p + ch, up.substring(1)));
        }

        return result;
    }
}