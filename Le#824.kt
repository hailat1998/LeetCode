class Solution {
    fun toGoatLatin(s: String): String {
        val set = setOf('a','e','i','o','u')
        val j = s.trim().split("\\s+".toRegex())
        val result = StringBuilder()
        for (i in 0 until j.size) {
            if (set.contains(j[i][0].toLowerCase())) {
                result.append(j[i])
            } else {
                result.append(j[i].substring(1) + j[i][0])
            }
            result.append("ma").append("a".repeat(i + 1)).append(" ")
        }
        return result.toString().trim()
    }
}
