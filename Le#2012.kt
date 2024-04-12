class Solution {
    fun sumOfBeauties(n: IntArray): Int {
        val arrSm = IntArray(n.size)
        val arrPm = IntArray(n.size)
        arrPm[0] = n[0]
        arrSm[n.size - 1] = n.last()
        
        for (i in 1 until n.size) {
            arrPm[i] = Math.max(arrPm[i - 1], n[i])
        }
        
        for (i in n.size - 2 downTo 0) {
            arrSm[i] = Math.min(arrSm[i + 1], n[i])
        }
        
        var count = 0
        
        for (i in 1 until n.size - 1) {
            if (arrPm[i - 1] < n[i] && n[i] < arrSm[i + 1]) {
                count += 2
            } else if (n[i - 1] < n[i] && n[i] < n[i + 1]) {
                count++
            }
        }
        
        return count
    }
}
