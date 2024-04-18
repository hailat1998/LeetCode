class Solution {
    var max = 0 
    fun maxAreaOfIsland(g: Array<IntArray>): Int {
        var r = 0
       for(i in 0 until g.size){
        for(j in 0 until g[0].size){
            if(g[i][j] == 1){
               r = maxIs(g, i , j)
            }
            if(r > max ){
                max = r
            }
        }
       }
       return max  
    }
    fun maxIs(g:Array<IntArray> , i : Int , j: Int) : Int{
         if(j >= g[0].size || i >= g.size || j < 0 || i < 0) return 0
         
         if(g[i][j] == 0) return 0

            g[i][j] = 0


         val r = 1 + maxIs(g  , i+1 , j ) + maxIs(g , i , j+ 1) + maxIs(g , i - 1 , j ) + maxIs(g , i , j -1 )
          return r
        }
}
