class Solution {
    fun reversePrefix(word: String, ch: Char): String {
val substring = word.substring(0, word.indexOf(ch) + 1)
val reversedSubstring = substring.reversed()
val result = reversedSubstring + word.substring(word.indexOf(ch) + 1, word.length)
return result    }
}
