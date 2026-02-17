package hashing

/**
 * Problem: Contains Duplicate
 * Link: https://leetcode.com/problems/contains-duplicate/
 * Pattern: Hashing (Seen Set / Early Exit)
 * Time Complexity: O(N) - Single pass, can exit early if duplicate is found.
 * Space Complexity: O(N) - In the worst case (no duplicates), we store all elements in a HashSet.
 */
fun containsDuplicate(nums: IntArray): Boolean {
    if(nums.size < 2) return false
    val seen = HashSet<Int>(nums.size)

    // Using a HashSet with an initial capacity to reduce resizing
    // manual loop to allow for an "Early Exit"
    for(num in nums) {
        if(!seen.add(num)) {
            return true
        }
    }

    return false
}