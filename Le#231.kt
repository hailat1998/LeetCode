class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
       return n > 0 && n.toString(2).count{ it == '1'} == 1
    }
}
