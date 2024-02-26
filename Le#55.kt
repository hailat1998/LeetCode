class Solution {
    fun canJump(nums: IntArray): Boolean {
       val dp = BooleanArray(nums.size){ false }
       val size = nums.size 
       dp[nums.size-1] = true

       for(i in size-2 downTo 0){
           val max = minOf(size-1 ,  i+nums[i])
          loop@ for(j in i+1..max){
               if(dp[j]){
                   dp[i] = true
                   break@loop
               }
           }
       } 
       return dp[0]
    }
}
