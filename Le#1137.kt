class Solution {
    fun tribonacci(n: Int): Int {
        val arr = IntArray(38)
        arr[0] = 0
        arr[1] = 1
        arr[2] = 1

        for(i in 3 until 38){
            arr[i] = arr[i-3] + arr[i-2] + arr[i-1]
        }
        
        return arr[n]
    }
}
