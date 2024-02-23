class Solution {
    fun findJudge(n: Int, t: Array<IntArray>): Int {
        val arr1 = IntArray(n + 1) { 0 }
        val arr2 = IntArray(n + 1) { 0 }

        for (i in t) {
            arr1[i[0]]++
            arr2[i[1]]++
        }

        for (i in 1..n) {
            if (arr1[i] == 0 && arr2[i] == n - 1) {
                return i
            }
        }

        return -1
    }
}
