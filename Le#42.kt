class Solution {
    fun trap(h: IntArray): Int {
        val maxLeft = IntArray(h.size) { 0 }
        val maxRight = IntArray(h.size) { 0 }
        maxLeft[0] = h[0]
        maxRight[maxRight.size - 1] = h.last()

        for (i in 1 until h.size) {
            maxLeft[i] = maxOf(maxLeft[i - 1], h[i])
        }

        for (i in h.size - 2 downTo 0) {
            maxRight[i] = maxOf(maxRight[i + 1], h[i])
        }

        var count = 0
        for (i in 0 until h.size) {
            count += minOf(maxLeft[i], maxRight[i]) - h[i]
        }

        return count
    }
}
