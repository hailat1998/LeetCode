class Solution {
    fun customSortString(order: String, s: String): String {
        val map = mutableMapOf<Char, Int>()

        for (i in 0 until order.length) {
            map[order[i]] = i
        }
        
        val sortedArray = s.toCharArray()
            .sortedWith(compareBy<Char> { map[it] })
        
        return sortedArray.joinToString("")
    }
}
