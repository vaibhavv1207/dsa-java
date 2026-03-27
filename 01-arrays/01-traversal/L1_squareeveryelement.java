// ═══════════════════════════════════════════════
// Problem  : Square Every Element in Array
// Pattern  : Array Traversal — Element Transform
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Apply a transformation to every element.
// arr[i] = arr[i] * arr[i]  (in-place)
// OR create a new array to preserve the original.
//
// KEY OBSERVATION about squaring negatives:
// Negative squared = positive: (-3)² = 9
// So after squaring, ALL elements are non-negative.
//
// WHY THIS MATTERS:
// LC 977 "Squares of Sorted Array" is a real interview problem.
// The trick: sorted input [-4,-1,0,3,5] after squaring [16,1,0,9,25]
// is NOT sorted. You need Two Pointers to get sorted squares.
// This L1 problem is the foundation for that.
//
// DRY RUN (in-place):
// Input: [1, -2, 3, -4, 5]
//
//  i=0 → arr[0] = 1  × 1  = 1
//  i=1 → arr[1] = -2 × -2 = 4
//  i=2 → arr[2] = 3  × 3  = 9
//  i=3 → arr[3] = -4 × -4 = 16
//  i=4 → arr[4] = 5  × 5  = 25
//
// Output: [1, 4, 9, 16, 25]
//
// TIME  : O(n)
// SPACE : O(1) in-place, O(n) for new array
// ═══════════════════════════════════════════════

import java.util.Arrays;

public class L1_SquareEveryElement {

    // ── In-place (modifies original) ─────────────
    public static void squareInPlace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    // ── New array (preserves original) ──────────
    public static int[] squareNewArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, -2, 3, -4, 5};
        System.out.println("Original:   " + Arrays.toString(arr1));
        System.out.println("Squared:    " + Arrays.toString(squareNewArray(arr1)));
        // Expected: [1, 4, 9, 16, 25]

        int[] arr2 = {-4, -1, 0, 3, 5};
        System.out.println("\nSorted input:          " + Arrays.toString(arr2));
        System.out.println("Squares (NOT sorted):  " + Arrays.toString(squareNewArray(arr2)));
        // Expected: [16, 1, 0, 9, 25]
        // Note: squares of sorted array are NOT sorted
        // → LC 977 uses Two Pointers to sort these in O(n)

        int[] arr3 = {-3, -3, -3};
        System.out.println("\nAll same negatives: " + Arrays.toString(squareNewArray(arr3)));
        // Expected: [9, 9, 9]

        int[] arr4 = {0};
        System.out.println("Zero:               " + Arrays.toString(squareNewArray(arr4)));
        // Expected: [0]
    }
}
