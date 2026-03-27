// ═══════════════════════════════════════════════
// Problem  : Find Missing Number from 1 to N
// Pattern  : Array Traversal — Mathematical Observation
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// Link     : https://leetcode.com/problems/missing-number/ (LC 268)
// ═══════════════════════════════════════════════
//
// PROBLEM STATEMENT:
// Array contains N-1 elements from range [1, N].
// Exactly one number is missing. Find it.
//
// APPROACH 1 — Sum Formula (Best)
// Sum of 1 to N = N × (N+1) / 2
// Missing = expectedSum - actualSum
//
// APPROACH 2 — XOR (No overflow risk)
// XOR all numbers 1..N with all array elements.
// Same numbers cancel out. Only missing number remains.
//
// DRY RUN (Sum Formula):
// Input: [1, 2, 4, 5, 6],  N = 6
//
//  Expected sum = 6×7/2 = 21
//  Actual sum   = 1+2+4+5+6 = 18
//  Missing      = 21 - 18 = 3
//
// DRY RUN (XOR):
// Input: [1, 2, 4, 5, 6],  N = 6
//
//  XOR all 1..6    = 1^2^3^4^5^6
//  XOR all arr     = 1^2^4^5^6
//  XOR both        = 3   (3 appears once, all others twice → cancel)
//
// Output: 3
//
// WHY TWO APPROACHES:
// Sum formula can overflow for large N → use long
// XOR never overflows → preferred for very large N
//
// CONNECTS TO:
// • Find missing + duplicate (L4)
// • Single number (XOR trick) → LC 136
// • Find duplicate using cycle method (Binary Search / Floyd)
//
// TIME  : O(n) both approaches
// SPACE : O(1) both approaches
// ═══════════════════════════════════════════════

public class L1_FindMissingNumber {

    // ── Approach 1: Sum Formula ──────────────────
    public static int missingNumberSum(int[] arr, int n) {
        long expectedSum = (long) n * (n + 1) / 2;  // long to avoid overflow
        long actualSum   = 0;
        for (int num : arr) actualSum += num;
        return (int)(expectedSum - actualSum);
    }

    // ── Approach 2: XOR ──────────────────────────
    public static int missingNumberXOR(int[] arr, int n) {
        int xor = 0;
        for (int i = 1; i <= n; i++) xor ^= i;      // XOR all 1 to N
        for (int num : arr)          xor ^= num;     // XOR all array elements
        return xor;                                  // remaining = missing
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 6};
        int n1 = 6;
        System.out.println("Test 1 (Sum): " + missingNumberSum(arr1, n1));
        System.out.println("Test 1 (XOR): " + missingNumberXOR(arr1, n1));
        // Expected: 3

        int[] arr2 = {2, 3, 4, 5};
        int n2 = 5;
        System.out.println("Test 2 (Sum): " + missingNumberSum(arr2, n2));
        System.out.println("Test 2 (XOR): " + missingNumberXOR(arr2, n2));
        // Expected: 1  (first element missing)

        int[] arr3 = {1, 2, 3, 4};
        int n3 = 5;
        System.out.println("Test 3 (Sum): " + missingNumberSum(arr3, n3));
        System.out.println("Test 3 (XOR): " + missingNumberXOR(arr3, n3));
        // Expected: 5  (last element missing)

        int[] arr4 = {1};
        int n4 = 2;
        System.out.println("Test 4 (Sum): " + missingNumberSum(arr4, n4));
        System.out.println("Test 4 (XOR): " + missingNumberXOR(arr4, n4));
        // Expected: 2
    }
}
