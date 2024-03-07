
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
    fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
        var temp = head 
        var cur = head?.next 
         while(cur != null){
         val k = temp?.`val`!!
         val j = cur?.`val`!!
         val new = ListNode(GCD(k, j))
         temp?.next = new
         new?.next = cur
         temp = cur
         cur = cur?.next 
    }
    return head
} 

fun GCD(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }

    return num1
}
}
