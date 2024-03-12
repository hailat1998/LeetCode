class Solution {
    fun pivotInteger(n: Int): Int {
        var p: Int
        var j = ((1 + n) * n) / 2

        for (i in 0..n) {
            p = (1 + i) * i / 2
            if (j + i == p * 2 ) {
                return i
            }
        }
        
        return -1
    }
}
