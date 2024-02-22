class Solution {
    fun firstPalindrome(words: Array<String>): String {
    for(i in words){
        if(isPal(i)){
            return i
        }
    }
    return ""

    }
    fun isPal(s: String): Boolean{
       var j = 0
       var i = s.length-1
       while(j < i){
           if(s[i] != s[j]){
               return false
           }
           j++
           i--
       } 
       return true
    }
}
