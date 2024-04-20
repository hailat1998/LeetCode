class Solution {
    fun findFarmland(land: Array<IntArray>): Array<IntArray> {
        val list = mutableListOf<IntArray>()
        for (i in land.indices) {
            for (j in land[i].indices) {
                if (land[i][j] == 1) {
                    val farmland = dfs(land, i, j)
                    list.add(farmland)
                }
            }
        }
        return list.toTypedArray()
    }

    private fun dfs(land: Array<IntArray>, x: Int, y: Int): IntArray {
        var j = x
        var k = y
        for (i in x until land.size) {
            if (land[i][y] == 0) {
                break
            }
            land[i][y] = 0
            j = i
        }
        for (i in y + 1 until land[0].size) {
            if (land[x][i] == 0) {
                break
            }
            land[x][i] = 0
            k = i
        }

        for (i in x..j) {
            for (j in y..k) {
                land[i][j] = 0
            }
        }
        return intArrayOf(x, y, j, k)
    }
}
