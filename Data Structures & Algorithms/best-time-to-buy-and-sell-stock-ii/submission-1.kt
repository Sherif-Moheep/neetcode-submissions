class Solution {
    fun maxProfit(prices: IntArray): Int {
        var res = 0

        var l = 0
        var r = 1

        var maxProfit = 0

        while (l < prices.size) {
            if (r >= prices.size) {
                if (maxProfit > 0) {
//                    res += maxProfit
//                    maxProfit = 0
//                    l = r
//                    r = l + 1
                    res += maxProfit
                    break
                }
                else {
                    l++
                    r = l + 1
                }
            }

            else if (prices[r] > prices[l]) {
                val currentProfit = prices[r] - prices[l]
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit
                    r++
                } else {
                    res += maxProfit
                    maxProfit = 0
                    l = r
                    r = l + 1
                }
            }

            else {
                res += maxProfit
                maxProfit = 0
                l = r
                r = l + 1
            }
        }

        return res
    }
}
