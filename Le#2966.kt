class Solution {
    fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
        if (nums.size % 3 != 0) return arrayOf()
        nums.sort()
        val r = nums.size / 3
        val arr = Array(r) { IntArray(3) { 0 } }
        for (i in 0 until nums.size / 3) {
            val j = nums[i * 3]
            val kk = nums[i * 3 + 1]
            val b = nums[i * 3 + 2]
        
            if (b - j <= k) {
                arr[i][0] = j
                arr[i][1] = kk
                arr[i][2] = b
            } else {
             return   arrayOf<IntArray>() 
            }
           

        }
      

        return arr
    }
}
