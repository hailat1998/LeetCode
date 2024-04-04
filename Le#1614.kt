import java.util.Stack;

class Solution {
    fun maxDepth(s: String): Int {
        val stack = Stack<Char>()
        var count = 0
        var max = 0
        for (i in s) {
            if (i == '(') {
                stack.push(i)
                count++
                if (count > max) {
                    max = count
                }
            } else if (i == ')') {
                if (!stack.isEmpty()) {
                    stack.pop()
                    count--
                }
            }
        }
        return max
    }
}
