class Solution {
    fun singleNumber(nums: IntArray): Int {
       nums.sort()
       for(i in 0 until nums.size-1 step 2){
        if(nums[i+1] != nums[i]){
            return nums[i]
        }
       }
       return nums[nums.size - 1]
    }
}
