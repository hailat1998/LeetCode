class Solution {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        fun maxNorm(p: IntArray, q: IntArray): Int{
            return Math.max(Math.abs(p[0] - q[0]) , Math.abs(p[1] - q[1]))
        }
        var ans = 0
        var j = points[0]
        for(i in 1 until points.size){
            ans += maxNorm(j , points[i])
            j = points[i] 
        }
        return ans
    }
}
