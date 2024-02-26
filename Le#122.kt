class Solution {
    fun maxProfit(nums: IntArray): Int {
      var profit = 0 
      for(i in 1 until nums.size){
       if(nums[i] > nums[i-1]){
           profit += nums[i] - nums[i-1]
       }
      }
      return profit
    }
}
