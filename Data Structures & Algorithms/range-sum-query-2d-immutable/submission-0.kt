class NumMatrix(matrix: Array<IntArray>) {
    val n = matrix.size
    val m = matrix[0].size
    val prefix = Array(n) { IntArray(m) }

    init {
        for (i in 0 until  n) {
            for (j in 0 until m) {
                prefix[i][j] = matrix[i][j]

                if (i > 0) {
                    prefix[i][j] += prefix[i - 1][j]
                }

                if (j > 0) {
                    prefix[i][j] += prefix[i][j - 1]
                }

                if (i > 0 && j > 0) {
                    prefix[i][j] -= prefix[i - 1][j - 1]
                }
            }
        }
    }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {

        val total = prefix[row2][col2]
        val left  = if (col1 > 0) prefix[row2][col1 - 1] else 0
        val top = if (row1 > 0) prefix[row1 - 1][col2] else 0
        val overlap = if (row1 > 0 && col1 > 0) prefix[row1 - 1][col1 - 1] else 0

        val result = total - left - top + overlap
        return result
    }
}