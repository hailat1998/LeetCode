class Solution {
    fun maximumSwap(num: Int): Int {
        val s = num.toString()
        var st = s
        var ans = num
        val n = s.length

        for (i in 0 until n) {
            for (j in i + 1 until n) {
                st = swap(st, i, j)
                val x = st.toInt()
                ans = maxOf(ans, x)
                st = s
            }
        }

        return ans
    }

    private fun swap(s: String, i: Int, j: Int): String {
        val chars = s.toCharArray()
        val temp = chars[i]
        chars[i] = chars[j]
        chars[j] = temp
        return String(chars)
    }
}
