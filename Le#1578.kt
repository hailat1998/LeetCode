class Solution {
    fun minCost(c: String, n: IntArray): Int {
        var r  = 0
        var j = 0
        var time = 0
        while(r < c.length-1){
            if(c[r] == c[r+1]){
                j = r+1
                while(j + 1 < c.length && c[j] == c[j+1]){
                    j++
                }
                val l = n.sliceArray(r..j)
                val k = l.max()
                time += l.sum() - k
                  r = j + 1
            }else{
                r++
            }
        }
        return time
    }
}
