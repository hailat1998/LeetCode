class Solution {
    fun numSquares(n: Int): Int {
        return coinChange(n)
    }

    fun coinChange( amount: Int): Int {
        val dp = IntArray(amount + 1) { Int.MAX_VALUE }
        dp[0] = 0

        for (i in 1..amount) {
               
           loop@ for (j in 1..i) {
               if(j*j > amount)
                  break@loop
                 if (j*j <= i) {
                    dp[i] = minOf(dp[i], dp[i - j*j] + 1)
                }
            }
        }
      return dp[amount]
    }
}
