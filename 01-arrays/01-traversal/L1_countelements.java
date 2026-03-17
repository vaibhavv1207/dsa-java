// ═══════════════════════════════════════════════
// Problem  : Count Elements in an Array
// Pattern  : Array Traversal
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// The count of elements = arr.length in Java.
// But the manual way (incrementing a counter per element)
// builds the habit for ALL future counting problems
// (count evens, count negatives, count duplicates etc.)
//
// DRY RUN:
// Input: [10, 20, 30, 40, 50]
//
//  i=0 → count = 1
//  i=1 → count = 2
//  i=2 → count = 3
//  i=3 → count = 4
//  i=4 → count = 5
//
// Output: 5
//
// NOTE:
// In real problems, counting is always CONDITIONAL.
// Example: count elements > X, count even elements.
// This file shows the base version — condition = always true.
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_CountElements {

    // ── Manual Count (builds habit) ─────────────
    public static int countManual(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;          // condition = always true here
        }
        return count;
    }

    // ── Direct (Java built-in) ──────────────────
    public static int countDirect(int[] arr) {
        return arr.length;    // O(1) — length is stored, not computed
    }

    // ── Quick Test ──────────────────────────────
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("Test 1 (manual) : " + countManual(arr1));
        System.out.println("Test 1 (direct) : " + countDirect(arr1));
        // Expected: 5

        int[] arr2 = {7};
        System.out.println("Test 2 (manual) : " + countManual(arr2));
        System.out.println("Test 2 (direct) : " + countDirect(arr2));
        // Expected: 1

        int[] arr3 = {};
        System.out.println("Test 3 (manual) : " + countManual(arr3));
        System.out.println("Test 3 (direct) : " + countDirect(arr3));
        // Expected: 0  (empty array)
    }
}
