class Solution {
  fun reverse(li : ListNode? ) : ListNode? {
var prev : ListNode? = null;
var cur :ListNode? = li;
while(cur != null){
 var next = cur?.next
 cur?.next = prev ; 
 prev = cur;
 cur = next;
}

return prev;

  }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
      var li1= reverse(l1);
      var li2= reverse(l2);
       var rem : Int = 0 
       var l3 : ListNode? = ListNode(0);
        var dummy = l3 ; 

       while(li2 != null || li1 != null || rem != 0  ){
      var val1 = if(li1 != null){ 
                          li1?.`val`;
         }else{ 0;}
      var val2 =if(li2 != null){ 
                          li2?.`val`;
         }else{  0; }
         var sum = val1 + val2 + rem ;
         var digit = sum % 10;
         rem = sum / 10 ;
          l3?.next = ListNode(digit);
          l3 = l3?.next ; 
          li1 = if(li1 != null){ 
                 li1?.next;
         } else { null;}
          li2 = if(li2 != null){ 
                          li2?.next;
         } else {  null; }
         
 }
 dummy = dummy?.next ; 
return reverse(dummy)
        }
}
