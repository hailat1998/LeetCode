class Solution {
    fun minimumLength(s: String): Int {
       if(s.length == 1) return 1
        val j = s.toCharArray()
        var r = j.size - 1
        var l = 0
        while (r > l) {
            if (j[r] == j[l]) {
                while (r > l && j[r - 1] == j[l]) {
                    r--
                }
                while (r > l && j[r] == j[l + 1]) {
                    l++
                }
            } else {
                break
            }
            l++
            r--
        }
         
        return if(r - l < 0) 0 else r - l + 1
    }
}
