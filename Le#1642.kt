import java.util.*

class Solution {
    fun furthestBuilding(h: IntArray, ba: Int, la: Int): Int {
        val p = PriorityQueue<Int> { a, b -> b - a }
       var b = ba
       var l = la
        var i = 0
        var diff = 0
        while (i < h.size - 1) {
            diff = h[i + 1] - h[i]

            if (diff <= 0) {
                i++
                continue
            }

            b -= diff
            p.offer(diff)

            if (b < 0) {
                b += p.poll()
                l--
            }

            if (l < 0) {
                break
            }

            i++
        }

        return i
    }
}
