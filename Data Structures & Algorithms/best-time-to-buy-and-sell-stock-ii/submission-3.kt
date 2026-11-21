class Solution {
    fun maxProfit(prices: IntArray): Int {
        val size = prices.size
        var res = 0
        for (i in 1 until size) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1]
            }
        }
        return res
    }
}
