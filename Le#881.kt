class Solution {
    fun numRescueBoats(p: IntArray, limit: Int): Int {
        var r = p.size - 1 
        var l = 0
        var count = 0 
        p.sort()
        while(r >= l){
             if(p[r] + p[l] <= limit){
                count++
                r--
                l++
             } else {
                r--
                count++
             }
        }
        return count 
    }
}
