// ═══════════════════════════════════════════════
// Problem  : Sum of All Elements in an Array
// Pattern  : Array Traversal
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Keep a running total (accumulator).
// Add each element to it as we traverse.
// Final accumulator = sum of all elements.
//
// DRY RUN:
// Input: [10, 20, 30, 40, 50]
//
//  i=0 → sum = 0  + 10 = 10
//  i=1 → sum = 10 + 20 = 30
//  i=2 → sum = 30 + 30 = 60
//  i=3 → sum = 60 + 40 = 100
//  i=4 → sum = 100+ 50 = 150
//
// Output: 150
//
// EDGE CASES:
// • Empty array       → sum = 0
// • All negatives     → sum is negative
// • Single element    → sum = that element
//
// TIME  : O(n) — visit every element once
// SPACE : O(1) — only one extra variable
// ═══════════════════════════════════════════════

public class L1_SumOfElements {

    // ── Solution ────────────────────────────────
    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // ── Quick Test ──────────────────────────────
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("Test 1: " + sumOfElements(arr1));
        // Expected: 150

        int[] arr2 = {-5, -10, -15};
        System.out.println("Test 2: " + sumOfElements(arr2));
        // Expected: -30  (all negatives)

        int[] arr3 = {7};
        System.out.println("Test 3: " + sumOfElements(arr3));
        // Expected: 7  (single element)

        int[] arr4 = {};
        System.out.println("Test 4: " + sumOfElements(arr4));
        // Expected: 0  (empty array)

        int[] arr5 = {-3, 0, 7, -1, 4};
        System.out.println("Test 5: " + sumOfElements(arr5));
        // Expected: 7
    }
}
