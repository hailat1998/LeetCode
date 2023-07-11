class Solution {
    fun reverse(x: Int): Int {
   if(x == -2147483648)
       return 0;
        var o=0
        if(x<0)
          o=-1
          else
          o=1
          val y = Math.abs(x)
        val h:String = y.toString()
        var s:String = ""
        var i=h.length-1
        while(i>=0){
          s=s+h[i]
          --i  
        }
        val k : Long = s.toLong();
        if(k >= Int.MAX_VALUE || k < Int.MIN_VALUE)
          return 0
        else{
            if(o<0)
              return -k.toInt();
             else
              return k.toInt();
        }
     }
}
/*
function that returns value on reverse order in 32 bit environment
eg -3456   return value -6543   */
