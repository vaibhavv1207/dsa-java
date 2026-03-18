// ═══════════════════════════════════════════════
// Problem  : Count Even and Odd Elements
// Pattern  : Array Traversal — Conditional Counter
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Use modulo operator (%) to check divisibility.
// arr[i] % 2 == 0  → even
// arr[i] % 2 != 0  → odd
//
// This is the foundational "conditional counter" pattern.
// It directly extends to:
// • Count positives/negatives
// • Count elements > X
// • Count elements in range [L, R]
// • Count divisible by K
//
// KEY INSIGHT — Negative numbers:
// In Java, -3 % 2 = -1 (not 1).
// So for negatives, use: arr[i] % 2 != 0 for odd
// instead of arr[i] % 2 == 1
// OR use: Math.abs(arr[i]) % 2 == 0
//
// DRY RUN:
// Input: [1, 2, 3, 4, 5, 6, -3, -4]
//
//  i=0 → 1  % 2 = 1  ≠ 0 → odd++  → odd=1
//  i=1 → 2  % 2 = 0  = 0 → even++ → even=1
//  i=2 → 3  % 2 = 1  ≠ 0 → odd++  → odd=2
//  i=3 → 4  % 2 = 0  = 0 → even++ → even=2
//  i=4 → 5  % 2 = 1  ≠ 0 → odd++  → odd=3
//  i=5 → 6  % 2 = 0  = 0 → even++ → even=3
//  i=6 → -3 % 2 = -1 ≠ 0 → odd++  → odd=4
//  i=7 → -4 % 2 = 0  = 0 → even++ → even=4
//
// Output: Even = 4, Odd = 4
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_CountEvenOdd {

    // ── Solution ────────────────────────────────
    public static void countEvenOdd(int[] arr) {
        int even = 0;
        int odd  = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("  Even = " + even + ", Odd = " + odd);
    }

    // ── Quick Test ──────────────────────────────
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.print("Test 1: ");
        countEvenOdd(arr1);
        // Expected: Even=3, Odd=3

        int[] arr2 = {1, 2, 3, 4, 5, 6, -3, -4};
        System.out.print("Test 2: ");
        countEvenOdd(arr2);
        // Expected: Even=4, Odd=4  (negatives handled correctly)

        int[] arr3 = {2, 4, 6, 8};
        System.out.print("Test 3: ");
        countEvenOdd(arr3);
        // Expected: Even=4, Odd=0

        int[] arr4 = {1, 3, 5, 7};
        System.out.print("Test 4: ");
        countEvenOdd(arr4);
        // Expected: Even=0, Odd=4

        int[] arr5 = {0};
        System.out.print("Test 5: ");
        countEvenOdd(arr5);
        // Expected: Even=1, Odd=0  (0 is even)
    }
}
