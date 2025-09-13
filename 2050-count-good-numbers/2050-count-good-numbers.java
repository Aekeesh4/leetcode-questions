class Solution {
    private static final long MOD = 1_000_000_007;

    // Modular exponentiation: (base^exp) % mod
    private long mypow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if (exp % 2 != 0) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }

        return result;
    }

    public int countGoodNumbers(long n) {
        long k = (n + 1) / 2; // Even indices
        long m = n / 2;       // Odd indices

        long s1 = mypow(5, k, MOD); // Ways to fill even positions
        long s2 = mypow(4, m, MOD); // Ways to fill odd positions

        return (int)((s1 * s2) % MOD);
    }
}