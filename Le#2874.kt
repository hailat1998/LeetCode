class Solution {
    fun maximumTripletValue(n: IntArray): Long {
       // if(n.size == 3) return (n[])
        val arrS = IntArray(n.size)
        val arrP = IntArray(n.size)
        arrP[0] = n[0]
        arrS[n.size - 1] = n.last()
        
        for (i in 1 until n.size) {
            arrP[i] = Math.max(arrP[i - 1], n[i])
        }
        
        for (i in n.size - 2 downTo 0) {
            arrS[i] = Math.max(arrS[i + 1], n[i])
        }
        
        var max : Long = Long.MIN_VALUE
        
        for (i in 1 until n.size - 1) {
            val k : Long = (arrP[i - 1] - n[i]).toLong() * arrS[i + 1].toLong()
            if (k > max) {
                max = k
            }
        }
        
return if(max > 0) max  else 0
    }
}
