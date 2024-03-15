class Solution {
    fun maxArea(h: IntArray): Int {
        var max = 0 
        var l = 0 
        var r = h.size-1
          while(r > l){
            max = maxOf(max , minOf(h[r] , h[l]) * (r - l))
            if(h[l] > h[r]){
                r--
            }else {
                l++
            }
          }
          return max
    }
}
