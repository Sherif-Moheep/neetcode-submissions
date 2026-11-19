class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val columns = Array(9) { hashSetOf<Int>() }
        val rows = Array(9) { hashSetOf<Int>() }

        for (startRow in 0 until 9 step 3) {
            for (startCol in 0 until 9 step 3) {
                val sub = hashSetOf<Int>()
                // Now at top-left corner (startRow, startCol) of a 3x3 sub-matrix
                for (r in startRow until startRow + 3) {
                    for (c in startCol until startCol + 3) {
                        val value = board[r][c]
                        // Process element
                        if (value != '.') {
                            if (sub.contains(value.digitToInt())) {
                                return false
                            }
                            sub.add(value.digitToInt())
                            
                            if (columns[c].contains(value.digitToInt())) {
                                return false
                            }
                            columns[c].add(value.digitToInt())
                            
                            if (rows[r].contains(value.digitToInt())) {
                                return false
                            }
                            rows[r].add(value.digitToInt())
                        }
                    }
                }
            }
        }
        return true
    }
}
