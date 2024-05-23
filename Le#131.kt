class Solution {
    fun partition(s: String): List<List<String>> {
        val result = mutableListOf<List<String>>()
        backtrack(s, 0, mutableListOf(), result)
        return result
    }

    private fun backtrack(s: String, start: Int, currentList: MutableList<String>, result: MutableList<List<String>>) {
       if(start >= s.length){
        result.add(currentList.toList())
        return
       }
       for(end in start+1..s.length){
        val k = s.substring(start , end)
        if(isPalindrome(k)){
            currentList.add(k)
            backtrack(s, end , currentList , result)
            currentList.removeAt(currentList.size - 1)
        }
       }
    }

    private fun isPalindrome(string: String): Boolean {
        val formattedString = string.replace(" ", "", ignoreCase = true)
        return formattedString == formattedString.reversed()
    }
}
