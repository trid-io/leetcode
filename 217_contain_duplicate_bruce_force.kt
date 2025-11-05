 // Time: O(n^2) - Space: O(1)
 fun containsDuplicate(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in (i + 1)..<nums.size) {
            if (nums[i] == nums[j]) return true
        }
    }
    return false
}