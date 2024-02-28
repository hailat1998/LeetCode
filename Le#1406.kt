class Solution {
    fun stoneGameIII(stone: IntArray): String {
        val memo = IntArray(stone.size){ Int.MAX_VALUE }
        val h = check(stone, 0 , stone.size , memo)
        if(h > 0){
            return "Alice"
        }else if(h < 0){
            return "Bob"
        }else{
            return "Tie"
        }
      }

   fun check(stone: IntArray, i: Int , n: Int, memo: IntArray): Int{
       if(n == i ) return 0
       
       if(memo[i] != Int.MAX_VALUE){
           return memo[i]
       }

       var r = stone[i] - check(stone , i+1 , n , memo)

       if(i + 2 <= n){
           r = Math.max(r, stone[i] + stone[i+1] - check(stone , i+2 , n , memo))
       }
        if(i + 3 <= n){
           r = Math.max(r, stone[i] + stone[i+1] + stone[i+2] - check(stone , i+3 , n , memo))
       }
       memo[i] = r
       return r
   }

}
