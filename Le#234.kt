import java.util.Deque;
import java.util.ArrayDeque;

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        val deque: Deque<ListNode?> = ArrayDeque()
        var count = 0
        var curr = head

        while (curr != null) {
            deque.addLast(curr)
            count++
            curr = curr.next
        }

         curr = head

         
        while (!deque.isEmpty() && curr != null) {
            val j = deque.removeLast()

            if (curr.`val` != j?.`val`) {
                return false
            }
            
                curr = curr.next
        }

        return true
    }
}
