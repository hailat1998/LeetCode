import java.util.*

class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        val map = hashMapOf<Int, ArrayList<Int>>()
        val q: Queue<Int> = LinkedList<Int>()
        for (i in edges) {
            val j = i[0]
            val k = i[1]
            map.computeIfAbsent(j) { ArrayList() }.add(k)
            map.computeIfAbsent(k) { ArrayList() }.add(j)
        }

        val set = hashSetOf<Int>()

        q.offer(source)
        set.add(source)

        while (q.isNotEmpty()) {
            val k = q.poll()
            if (k == destination) {
                return true
            }
            val list = map.getOrDefault(k, ArrayList())
            for (i in list) {
                if (!set.contains(i)) {
                    set.add(i)
                    q.offer(i)
                }
            }
        }
        return false
    }
}
