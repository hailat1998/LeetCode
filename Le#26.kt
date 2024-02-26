class Solution {
    fun removeDuplicates(nums: IntArray): Int {
       
        
        var k = 1
        var i = 1
        
        while (i < nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]
                k++
            }
            i++
        }
        
        return k
    }
}
