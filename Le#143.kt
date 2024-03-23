import java.util.*

class Solution {
    fun reorderList(head: ListNode?) {
        if (head?.next == null) return

        // Step 1: Find the middle of the list
        var slow = head
        var fast = head
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        // Step 2: Reverse the second half of the list
        var prev: ListNode? = null
        var curr = slow
        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        var secondHalf = prev

        // Step 3: Merge the first and reversed second half alternately
        var firstHalf = head
        while (secondHalf != null) {
            val firstNext = firstHalf?.next
            val secondNext = secondHalf.next

            firstHalf?.next = secondHalf
            secondHalf.next = firstNext

            firstHalf = firstNext
            secondHalf = secondNext
        }

        if(firstHalf != null && firstHalf?.next != null) firstHalf?.next?.next = null
    }
}
