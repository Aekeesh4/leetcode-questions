class Solution {
    public static String intToRoman(int num) {
        // Define Roman numeral mappings in descending order
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5,  4,  1};
        String[] symbols ={"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        // Greedy conversion
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    // Example usage
    public static void main(String[] args) {
        int num1 = 3749;
        int num2 = 58;
        int num3 = 1994;

        System.out.println(num1 + " → " + intToRoman(num1)); // MMMDCCXLIX
        System.out.println(num2 + " → " + intToRoman(num2)); // LVIII
        System.out.println(num3 + " → " + intToRoman(num3)); // MCMXCIV
    }
}