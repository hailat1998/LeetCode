class Solution {
    fun isAcronym(words: List<String>, s: String): Boolean {
        val chars = CharArray(words.size)
        for (i in 0 until words.size) {
            chars[i] = words[i][0]
        }
        val acronym = chars.joinToString("")
        return acronym.equals(s, ignoreCase = true)
    }
}
