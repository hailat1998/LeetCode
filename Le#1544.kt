class Solution {
    fun makeGood(s: String): String {
        var c = s.toCharArray()
        while (true) {
            var size = c.size
            var i = 0
            while (i < c.size - 1) {
                if ((c[i].isUpperCase() && c[i].toLowerCase() == c[i + 1]) || (c[i + 1].isUpperCase() && c[i + 1].toLowerCase() == c[i])) {
                    c[i] = '0'
                    c[i + 1] = '0'
                    i += 2
                } else {
                    i++
                }
            }
            c = c.filter { it != '0' }.toCharArray()
            if (size == c.size) {
                return c.joinToString("")
            }
        }
        return ""
    }
}
