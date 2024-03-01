class Solution {
    fun integerBreak(n: Int): Int {
       if(n <= 3) return n-1
       var k = 1 
       var n = n 
        while(n > 4){
            n -=3
            k *= 3
        }
        return k  * if(n > 0) n else 1
    }
}
