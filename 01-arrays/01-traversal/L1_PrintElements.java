// ═══════════════════════════════════════════════
// Problem  : Print All Elements of an Array
// Pattern  : Array Traversal
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Visit every index from 0 to n-1 and print the value.
// This is the foundation of ALL array logic.
// Every pattern (two pointers, sliding window, kadane)
// is built on top of this basic loop.
//
// DRY RUN:
// Input: [10, 20, 30, 40, 50]
//
//  i=0 → print 10
//  i=1 → print 20
//  i=2 → print 30
//  i=3 → print 40
//  i=4 → print 50
//
// Output: 10 20 30 40 50
//
// TIME  : O(n) — visit every element once
// SPACE : O(1) — no extra space used
// ═══════════════════════════════════════════════

public class L1_PrintElements {

    // ── Solution ────────────────────────────────
    public static void printElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println();
    }

    // ── Enhanced-For Loop version ────────────────
    // Cleaner syntax, same logic, same time & space
    public static void printElementsEnhanced(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ── Quick Test ──────────────────────────────
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.print("Test 1: ");
        printElements(arr1);
        // Expected: 10 20 30 40 50

        int[] arr2 = {5};
        System.out.print("Test 2: ");
        printElements(arr2);
        // Expected: 5  (single element)

        int[] arr3 = {-3, 0, 7, -1, 4};
        System.out.print("Test 3: ");
        printElements(arr3);
        // Expected: -3 0 7 -1 4  (negatives work fine)

        int[] arr4 = {};
        System.out.print("Test 4: ");
        printElements(arr4);
        // Expected: (empty line — no elements)
    }
}
