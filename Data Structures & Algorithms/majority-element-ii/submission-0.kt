class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        val freqMap = HashMap<Int, Int>(nums.size)

        for (num in nums) {
            freqMap[num] = freqMap.getOrPut(num){ 0 } + 1
        }

        return freqMap.filter {
            it.value > nums.size / 3
        }.keys.toList()
    }
}
