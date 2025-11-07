 // Time: O(n^2) - Space: O(1)
 fun containsDuplicate_bruceForce(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in (i + 1)..<nums.size) {
            if (nums[i] == nums[j]) return true
        }
    }
    return false
}

// Time: O(n) - Space: O(n)
fun containsDuplicate_optimized(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (num in nums) {
        if (set.contains(num)) return true
        set.add(num)
    }
    return false
}

// Time: O(n) - Space: O(n)
fun containsDuplicate_trick(nums: IntArray): Boolean {
    val set = nums.toSet()
    if (set.size < nums.size) return true
    return false
}
