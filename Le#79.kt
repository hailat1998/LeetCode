class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val visited = Array(board.size) { BooleanArray(board[0].size) }
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (fill(board, i, j, word, 0, visited)) {
                    return true
                }
            }
        }
        return false
    }

    fun fill(board: Array<CharArray>, row: Int, col: Int, word: String, index: Int, visited: Array<BooleanArray>): Boolean {
        if (index == word.length) {
            return true
        }
        if (row < 0 || col < 0 || row >= board.size || col >= board[0].size || visited[row][col] || board[row][col] != word[index]) {
            return false
        }
        visited[row][col] = true
        val found = fill(board, row + 1, col, word, index + 1, visited) ||
                fill(board, row - 1, col, word, index + 1, visited) ||
                fill(board, row, col + 1, word, index + 1, visited) ||
                fill(board, row, col - 1, word, index + 1, visited)
        visited[row][col] = false
        return found
    }
}
