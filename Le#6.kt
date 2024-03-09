class Solution {
    fun convert(s: String, n: Int): String {
        if (n == 1) {
            return s
        }
        
        val arr = Array(n) { CharArray(s.length) }
        var j = 0
        var down = true
        var l = 0
        
        while (l < s.length) {
            if (down) {
                for (k in 0 until n) {
                    if (l >= s.length) {
                        break
                    }
                    arr[k][j] = s[l]
                    l++
                }
                j++
                down = false
            } else {
                for (k in n - 2 downTo 1) {
                    if (l >= s.length) {
                        break
                    }
                    arr[k][j] = s[l]
                    l++
                    j++
                }
                down = true
            }
        }
        
        val st = StringBuilder()
        for (i in 0 until n) {
            for (j in 0 until s.length) {
                if (arr[i][j] != '\u0000') {
                    st.append(arr[i][j])
                }
            }
        }
        
        return st.toString()
    }
}
