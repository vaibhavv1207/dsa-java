// ═══════════════════════════════════════════════
// Problem  : Print Array in Reverse Order
// Pattern  : Array Traversal — Backward Loop
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Instead of starting at index 0, start at the last index (n-1)
// and move backward to index 0.
//
// Last index = arr.length - 1
//
// This backward traversal is the foundation for:
// • Reverse an array in-place    (Two Pointers)
// • Leaders in array             (right-to-left scan)
// • Next greater element         (right-to-left + stack)
// • Suffix sum / suffix max      (right-to-left prefix idea)
// • Trapping rain water          (right max array)
//
// DRY RUN:
// Input: [10, 20, 30, 40, 50]
//         n = 5, last index = 4
//
//  i=4 → print 50
//  i=3 → print 40
//  i=2 → print 30
//  i=1 → print 20
//  i=0 → print 10
//
// Output: 50 40 30 20 10
//
// THREE WAYS TO DO IT:
// 1. Backward loop         → i from n-1 to 0
// 2. Extra array           → copy in reverse, then print
// 3. Two-pointer in-place  → swap from both ends (covered in L3)
//
// TIME  : O(n)
// SPACE : O(1) for backward loop, O(n) for extra array
// ═══════════════════════════════════════════════

public class L1_ReversePrinting {

    // ── Method 1: Backward Loop (Best) ──────────
    public static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(" ");
        }
        System.out.println();
    }

    // ── Method 2: Using extra array ─────────────
    // Space: O(n) — only use if you need the reversed array stored
    public static void printReverseUsingExtraArray(int[] arr) {
        int n = arr.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[n - 1 - i] = arr[i];   // place arr[i] at mirror index
        }
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ── Quick Test ──────────────────────────────
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.print("Test 1 (backward loop)  : ");
        printReverse(arr1);
        // Expected: 50 40 30 20 10

        System.out.print("Test 1 (extra array)    : ");
        printReverseUsingExtraArray(arr1);
        // Expected: 50 40 30 20 10

        int[] arr2 = {1, 2, 3};
        System.out.print("Test 2: ");
        printReverse(arr2);
        // Expected: 3 2 1

        int[] arr3 = {-5, 0, 7};
        System.out.print("Test 3: ");
        printReverse(arr3);
        // Expected: 7 0 -5

        int[] arr4 = {42};
        System.out.print("Test 4: ");
        printReverse(arr4);
        // Expected: 42  (single element — same forward and backward)
    }
}
