class Solution {
    fun maximumOddBinaryNumber(s: String): String {
        val j = s.count { it == '0' }
        val k = s.count { it == '1' }

        val sn = StringBuilder()

        if (k > 1) {
            for (i in 1 until k) {
                sn.append('1')
            }
        }

        for (i in 1..j) {
            sn.append('0')
        }

        sn.append('1')

        return sn.toString()
    }
}
