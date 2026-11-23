class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        for (start in nums.indices) {
            var sum = 0
            for (end in start until nums.size) {
                sum += nums[end]
                if (sum == k) count++
            }
        }
        return count
    }
}
