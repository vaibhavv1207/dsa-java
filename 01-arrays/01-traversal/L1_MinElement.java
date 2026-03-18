// ═══════════════════════════════════════════════
// Problem  : Find Minimum Element in an Array
// Pattern  : Array Traversal
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Mirror logic of finding maximum.
// Assume first element is the answer.
// Update whenever you find something smaller.
//
// IMPORTANT PATTERN NOTE:
// Max and Min together are used in:
// • Range of array = max - min
// • Normalizing arrays
// • Sliding window (max-min) <= K
// • Two pointer pair problems
// Always know how to find both in one pass.
//
// DRY RUN:
// Input: [3, 7, 1, 9, 4, 6]
//
//  min = 3   (assume first)
//  i=1 → arr[1]=7  > min(3)  → no change
//  i=2 → arr[2]=1  < min(3)  → min = 1
//  i=3 → arr[3]=9  > min(1)  → no change
//  i=4 → arr[4]=4  > min(1)  → no change
//  i=5 → arr[5]=6  > min(1)  → no change
//
// Output: 1
//
// BONUS — Find Both Max & Min in Single Pass:
// Input: [3, 7, 1, 9, 4]
//  Start: max=3, min=3
//  i=1: 7>max → max=7
//  i=2: 1<min → min=1
//  i=3: 9>max → max=9
//  i=4: nothing
//  Result: max=9, min=1
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_MinElement {

    // ── Find Minimum ─────────────────────────────
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // ── Bonus: Find Max & Min in Single Pass ────
    public static void findMaxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("  Max = " + max + ", Min = " + min + ", Range = " + (max - min));
    }

    // ── Quick Test ──────────────────────────────
    public static void main(String[] args) {

        int[] arr1 = {3, 7, 1, 9, 4, 6};
        System.out.println("Test 1: " + findMin(arr1));
        // Expected: 1

        int[] arr2 = {-5, -1, -8, -3};
        System.out.println("Test 2: " + findMin(arr2));
        // Expected: -8  (most negative = minimum)

        int[] arr3 = {42};
        System.out.println("Test 3: " + findMin(arr3));
        // Expected: 42

        int[] arr4 = {5, 5, 5, 5};
        System.out.println("Test 4: " + findMin(arr4));
        // Expected: 5

        System.out.println("\n-- Max & Min in Single Pass --");
        findMaxAndMin(new int[]{3, 7, 1, 9, 4, 6});
        // Expected: Max=9, Min=1, Range=8
        findMaxAndMin(new int[]{-5, -1, -8, -3});
        // Expected: Max=-1, Min=-8, Range=7
    }
}
