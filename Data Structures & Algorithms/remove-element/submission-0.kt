class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0
        var r = 0
        var l = 0

        while (r < nums.size) {
            if (nums[r] != `val`) {
                nums[l] = nums[r]
                l++
                k++
            }
            r++
        }
        return k
    }
}
