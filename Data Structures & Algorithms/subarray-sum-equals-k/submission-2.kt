class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var currentSum = 0
        val prefixSums = HashMap<Int, Int>()
        prefixSums[0] = 1

        for (num in nums) {
            currentSum += num
            val diff = currentSum - k

            count += prefixSums.getOrDefault(diff, 0)
            prefixSums[currentSum] = prefixSums.getOrDefault(currentSum, 0) + 1
        }
        return count
    }
}
