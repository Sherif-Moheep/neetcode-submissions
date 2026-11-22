class Solution {
   fun majorityElement(nums: IntArray): List<Int> {
        val freqMap = HashMap<Int, Int>()

        for (num in nums) {
            freqMap[num] = freqMap.getOrPut(num){ 0 } + 1

            if (freqMap.size > 2) {
                freqMap.replaceAll { _, v -> v - 1 }
                freqMap.entries.removeAll { it.value == 0 }
            }
        }

        return freqMap.keys.filter { candidate ->
            nums.count { it == candidate } > nums.size / 3
        }
    }
}
