class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        var max = 0
        var freq = 0
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
            if (map[num]!! > freq) {
                freq++
                max = num
            }
        }
        return max
    }
}