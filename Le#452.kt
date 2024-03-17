class Solution {
    fun findMinArrowShots(p: Array<IntArray>): Int {
       p.sortBy { it[1] }
       var start = p[0]
       var count  = 0
       for(i in 1 until p.size){
        if(p[i][0] <= start[1]){
            continue
        }else{
         count++
         start = p[i]
        }
       }
      return count+1
    }
}
