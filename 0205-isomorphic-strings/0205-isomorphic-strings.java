class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256]; // ASCII size
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If last seen positions don't match, mapping is invalid
            if (mapS[c1] != mapT[c2]) return false;

            // Update last seen positions (i + 1 to avoid default 0 conflict)
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }

        return true;
    }
}