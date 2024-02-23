class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        for (i in strs) {
            val sortedString = i.toCharArray().sorted().joinToString("")
            map.computeIfAbsent(sortedString) { mutableListOf() }.add(i)
        }
        return map.values.toList()
    }
}
