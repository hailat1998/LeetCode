class Solution {
    fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
        tokens.sort()
        var power = power 
        var s = 0
        var l = 0 
        var max =0 
        var r = tokens.size - 1
        while(l <= r){
            when{
                power >= tokens[l] -> { power -= tokens[l]
                                 l++
                                 s++
                               max = Math.max(s,max)
                                 }
                s >= 1 -> {power += tokens[r]
                               r--
                               s--} 
                else -> break 
            }
        }
        return max
    }
}
