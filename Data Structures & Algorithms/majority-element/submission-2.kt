class Solution {
    fun majorityElement(nums: IntArray): Int {
        var res = 0
        var count = 0
        for (num in nums) {
            if (count == 0) res = num

            if (res == num) count++
            else count--
        }
        return res
    }
}