// ═══════════════════════════════════════════════
// Problem  : Find Maximum Element in an Array
// Pattern  : Array Traversal
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Assume first element is the answer.
// Traverse and update answer whenever you find
// something bigger. At the end, answer = max.
//
// This "assume first, update on better" pattern
// is reused in: Second Largest, Kadane's,
// Best Time to Buy Stock, and many more.
//
// DRY RUN:
// Input: [3, 7, 1, 9, 4, 6]
//
//  max = 3   (assume first)
//  i=1 → arr[1]=7  > max(3)  → max = 7
//  i=2 → arr[2]=1  < max(7)  → no change
//  i=3 → arr[3]=9  > max(7)  → max = 9
//  i=4 → arr[4]=4  < max(9)  → no change
//  i=5 → arr[5]=6  < max(9)  → no change
//
// Output: 9
//
// EDGE CASES:
// • All negatives → max is the least negative
// • Single element → that element is max
// • All same → any element is max
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_MaxElement {

    // ── Solution ────────────────────────────────
    public static int findMax(int[] arr) {
        int max = arr[0];                    // assume first is answer
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];                // update on finding better
            }
        }
        return max;
    }

    // ── Quick Test ──────────────────────────────
    public static void main(String[] args) {

        int[] arr1 = {3, 7, 1, 9, 4, 6};
        System.out.println("Test 1: " + findMax(arr1));
        // Expected: 9

        int[] arr2 = {-5, -1, -8, -3};
        System.out.println("Test 2: " + findMax(arr2));
        // Expected: -1  (all negatives — least negative is max)

        int[] arr3 = {42};
        System.out.println("Test 3: " + findMax(arr3));
        // Expected: 42  (single element)

        int[] arr4 = {5, 5, 5, 5};
        System.out.println("Test 4: " + findMax(arr4));
        // Expected: 5  (all same)

        int[] arr5 = {1, 2, 3, 4, 5};
        System.out.println("Test 5: " + findMax(arr5));
        // Expected: 5  (max at end)

        int[] arr6 = {9, 4, 2, 1};
        System.out.println("Test 6: " + findMax(arr6));
        // Expected: 9  (max at start)
    }
}
