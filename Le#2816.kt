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
    fun doubleIt(head: ListNode?): ListNode? {
      var temp = reverseLinkedList(head) 
      var dumb = temp
      var cur = temp
      var rem = 0 
      while(temp != null){
        val k = (temp?.`val`)!!
         
        temp?.`val` = (k * 2 + rem ) % 10
        rem = (k * 2 + rem ) / 10
        cur = temp
        temp = temp?.next
      }
      if(rem > 0){
        cur?.next = ListNode(rem)
      }

    return reverseLinkedList(dumb)
     }


     fun reverseLinkedList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head

    while (current != null) {
        val nextNode = current.next
        current.next = prev
        prev = current
        current = nextNode
    }

    return prev
}
}
