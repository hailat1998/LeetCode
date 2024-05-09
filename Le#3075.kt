class Solution {
    fun maximumHappinessSum(h: IntArray, k: Int): Long {
        h.sortDescending()
        var sum: Long = h[0].toLong()
        for (i in 1 until k) {
          h[i] = Math.max(h[i] - i , 0)
            sum += h[i].toLong()
        }
        return sum
    }
}
