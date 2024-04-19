class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0 
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    count++
                    fill(grid, i, j)
                }
            }
        }
        return count
    }
    
    fun fill(grid: Array<CharArray>, x: Int, y: Int) {
        if (x >= 0 && x < grid.size && y >= 0 && y < grid[0].size) {
            if (grid[x][y] == '1') {
                grid[x][y] = '0'
                fill(grid, x + 1, y)
                fill(grid, x - 1, y)
                fill(grid, x, y + 1)
                fill(grid, x, y - 1)
            }
        }
    }
}
