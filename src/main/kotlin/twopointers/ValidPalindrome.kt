package twopointers

/**
 * Problem: Valid Palindrome
 * Link: https://leetcode.com/problems/valid-palindrome/
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
fun isPalindrome(s: String): Boolean {
    var end = s.length - 1
    var start = 0
    while (start < end) {
        val leftChar = s[start]
        val rightChar = s[end]

        if(!leftChar.isLetterOrDigit()) {
            start++
        } else if (!rightChar.isLetterOrDigit()) {
            end--
        } else {
            if (leftChar.lowercaseChar() != rightChar.lowercaseChar()) {
                return false
            }
            start++
            end--
        }
    }
    return true
}