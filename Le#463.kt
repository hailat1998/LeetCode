class Solution {
    fun islandPerimeter(g: Array<IntArray>): Int {
        var per = 0
        for(i in 0 until g.size){
            for(j in 0 until g[0].size){
                if(g[i][j] == 1 && i-1 < 0){
                    per++
                }
                if(g[i][j] == 1 && j - 1 < 0){
                    per++
                }
                if(g[i][j] == 1 && i+1 == g.size){
                    per++
                }
                if(g[i][j] == 1 && j+1 == g[0].size){
                      per++
                    }
                    if(i - 1 >= 0 && g[i][j] == 1 && g[i - 1][j] == 0){
                        per++
                    }
                    if(j - 1 >= 0 && g[i][j] == 1 && g[i][j - 1] == 0){
                        per++
                    }
                    if(i+1 < g.size && g[i][j] == 1 && g[i+1][j] == 0){
                        per++
                    } 
                    if(j + 1 < g[0].size && g[i][j] == 1 && g[i][j + 1] == 0){
                        per++
                    }
            }
        }
        return per
    }
}
