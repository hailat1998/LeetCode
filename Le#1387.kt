class Solution {
    private fun a(n: Int): Int {
        var ct = 0
        var num = n
        while (num > 1) {
            if (num and 1 == 1)
                num = num * 3 + 1
            else
                num /= 2
            ct++
        }
        return ct
    }

    fun getKth(lo: Int, hi: Int, k: Int): Int {
        val po = mutableListOf<Pair<Int, Int>>()

        for (i in lo..hi) {
            po.add(Pair(a(i), i))
        }
        po.sortBy { it.first }

        return po[k - 1].second
    }
}
