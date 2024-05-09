import java.util.*;

class Solution {
    fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray {
        val p = PriorityQueue<Pair<Float, Pair<Int, Int>>>(compareBy { it.first })

        for (i in 0 until arr.size) {
            for (j in i + 1 until arr.size) {
                val fraction = arr[i].toFloat() / arr[j]
                p.offer(fraction to (i to j))
            }
        }

        var l = 0
        var ans = Pair(0f, Pair(0, 0))
        while (!p.isEmpty() && l < k) {
            ans = p.poll()
            l++
        }

        return intArrayOf(arr[ans.second.first], arr[ans.second.second])
    }
}
