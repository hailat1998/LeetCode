import java.util.*

class Solution {
    fun frequencySort(s: String): String {
        val hm = HashMap<Char, Int>()

        for (c in s) {
            hm[c] = hm.getOrDefault(c, 0) + 1
        }

        val pq = PriorityQueue<Map.Entry<Char, Int>>(compareByDescending { it.value })
        pq.addAll(hm.entries)

        val result = StringBuilder()
        while (!pq.isEmpty()) {
            val entry = pq.poll()
            result.append(entry.key.toString().repeat(entry.value))
        }

        return result.toString()
    }
}
