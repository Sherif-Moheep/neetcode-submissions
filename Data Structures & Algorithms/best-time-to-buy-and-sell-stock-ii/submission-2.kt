class Solution {
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1]
            }
        }
        return res
    }
}
