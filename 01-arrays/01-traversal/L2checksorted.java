// ═══════════════════════════════════════════════
// Problem  : Check if Array is Sorted
// Pattern  : Array Traversal — Adjacent Comparison
// Level    : L2 — Decision Making
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// A sorted array means every element is <= the next one.
// Compare each adjacent pair (arr[i], arr[i+1]).
// If ANY pair violates → not sorted → return false.
// If ALL pairs pass → sorted → return true.
//
// KEY: Loop runs from i=0 to i < n-1 (not n)
// Because we compare arr[i] with arr[i+1].
// If i goes up to n-1, arr[i+1] = arr[n] → IndexOutOfBounds.
//
// DRY RUN (sorted):
// Input: [1, 3, 5, 7, 9]
//
//  i=0 → arr[0]=1  <= arr[1]=3  ✓
//  i=1 → arr[1]=3  <= arr[2]=5  ✓
//  i=2 → arr[2]=5  <= arr[3]=7  ✓
//  i=3 → arr[3]=7  <= arr[4]=9  ✓
//  All passed → return true
//
// DRY RUN (not sorted):
// Input: [1, 3, 2, 7, 9]
//
//  i=0 → arr[0]=1  <= arr[1]=3  ✓
//  i=1 → arr[1]=3  <= arr[2]=2  ✗ → return false immediately
//
// VARIANTS:
// Strictly increasing  → arr[i] <  arr[i+1]
// Non-decreasing       → arr[i] <= arr[i+1]  (allows duplicates)
// Descending           → arr[i] >= arr[i+1]
//
// CONNECTS TO:
// • Binary Search requires sorted input — always verify
// • Two Pointer (sorted array problems)
// • Check if rotated and sorted (Binary Search L3)
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L2_CheckSorted {

    // ── Non-decreasing (allows duplicates) ──────
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    // ── Strictly increasing (no duplicates) ─────
    public static boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Test 1: " + isSorted(new int[]{1, 3, 5, 7, 9}));
        // Expected: true

        System.out.println("Test 2: " + isSorted(new int[]{1, 3, 2, 7, 9}));
        // Expected: false

        System.out.println("Test 3: " + isSorted(new int[]{1, 1, 2, 2, 3}));
        // Expected: true   (duplicates allowed in non-decreasing)

        System.out.println("Test 4: " + isStrictlyIncreasing(new int[]{1, 1, 2, 2, 3}));
        // Expected: false  (duplicates NOT allowed in strictly increasing)

        System.out.println("Test 5: " + isSorted(new int[]{5}));
        // Expected: true   (single element is always sorted)

        System.out.println("Test 6: " + isSorted(new int[]{9, 7, 5, 3, 1}));
        // Expected: false  (descending)
    }
}
