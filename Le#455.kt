class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        if (g.isEmpty() || s.isEmpty()) return 0
        g.sort()
        s.sort()
        var count = 0
        var k = 0
        for (i in 0 until g.size) {
            while (k < s.size && g[i] > s[k]) {
                k++
            }
            if (k == s.size) break
            count++
            k++
        }
        return count
    }
}
