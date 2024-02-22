class Solution {
    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()
        for (i in 0 until arr.size) {
            map[arr[i]] = map.getOrDefault(arr[i], 0) + 1
        }

        val sortedEntries = map.entries.sortedBy { it.value }
        var remainingK = k

        for ((key, value) in sortedEntries) {
            if (remainingK <= 0) break
            if (value <= remainingK) {
                remainingK -= value
                map[key] = 0
            }
        }

        return map.entries.count { it.value > 0 }
    }
}
