class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        nums.sort()
        val list = mutableListOf<Int>()
        
        for (i in 0 until nums.size - 1) {
            if (nums[i + 1] - nums[i] > 1) {
                (nums[i] + 1 until nums[i + 1]).forEach {
                    list.add(it)
                }
            }
        }
        
        if (nums.last() != nums.size + 1) {
            (nums[nums.size - 1] + 1..nums.size).forEach {
                list.add(it)
            }
        }
        if(nums.first() != 1){
            (1 until nums.first()).forEach{
                list.add(it)
            }
        }
        
        return list
    }
}
