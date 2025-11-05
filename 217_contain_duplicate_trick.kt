// Time: O(n) - Space: O(n)
fun containsDuplicate(nums: IntArray): Boolean {
    val set = nums.toSet()
    if (set.size < nums.size) return true
    return false
