class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val columns = Array(9) { hashSetOf<Char>() }
        val rows = Array(9) { hashSetOf<Char>() }

        for (startRow in 0 until 9 step 3) {
            for (startCol in 0 until 9 step 3) {
                val sub = hashSetOf<Char>()
                // Now at top-left corner (startRow, startCol) of a 3x3 sub-matrix
                for (r in startRow until startRow + 3) {
                    for (c in startCol until startCol + 3) {
                        val value = board[r][c]
                        // Process element
                        if (value != '.') {
                            if (!sub.add(value) || !columns[c].add(value) || !rows[r].add(value))
                                return false
                        }
                    }
                }
            }
        }
        return true
    }
}
