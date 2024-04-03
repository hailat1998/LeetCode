class Solution {
    fun reorderSpaces(text: String): String {
        val space = text.count { it == ' ' }
        if(space == 0) return text 
        val words = text.trim().split("\\s+".toRegex()) // Splitting by any amount of whitespace
        
        val k = words.size
       if (k == 1) return words[0] + " ".repeat(space)
        val j =  space / (k - 1)
        
        val str = StringBuilder()
        
        for (i in 0 until k) {
            str.append(words[i])
            
            if (i < k - 1) {
                str.append(" ".repeat(j))
            }
        }
        
        if (space % (k - 1) != 0) {
            str.append(" ".repeat(space % (k - 1)))
        }
        
        return str.toString()
    }
}
