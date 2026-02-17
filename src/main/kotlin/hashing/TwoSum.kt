package hashing

/**
 * Problem: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Pattern: Hashing
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val complementMap = HashMap<Int, Int>(nums.size)
    for ((currentIndex, value) in nums.withIndex()) {
        val complement = target - value

        // Use a single lookup instead of containsKey + get
        complementMap[complement]?.let { complementIndex ->
            return intArrayOf(complementIndex, currentIndex)
        }
        complementMap[value] = currentIndex
    }
    return intArrayOf()
}


fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val result = twoSum(nums, 9)
    println("Indices: ${result.joinToString()}")
}

