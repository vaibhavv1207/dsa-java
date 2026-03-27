// ═══════════════════════════════════════════════
// Problem  : Replace All Negatives with Zero
// Pattern  : Array Traversal — In-Place Update
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Traverse the array.
// When you find a negative value → overwrite it with 0.
// This is an IN-PLACE modification — no extra array needed.
//
// This "in-place update" habit is the foundation for:
// • Replace element with next greatest   (L3)
// • Move zeros to end                    (L3 — Two Pointers)
// • Sort 0s, 1s, 2s                      (Dutch National Flag)
// • Remove duplicates in-place           (Two Pointers L3)
//
// DRY RUN:
// Input: [3, -1, 0, -5, 7, -2, 4]
//
//  i=0 → arr[0]=3   >= 0? No change
//  i=1 → arr[1]=-1  <  0? → arr[1] = 0
//  i=2 → arr[2]=0   >= 0? No change   (zero stays zero)
//  i=3 → arr[3]=-5  <  0? → arr[3] = 0
//  i=4 → arr[4]=7   >= 0? No change
//  i=5 → arr[5]=-2  <  0? → arr[5] = 0
//  i=6 → arr[6]=4   >= 0? No change
//
// Output: [3, 0, 0, 0, 7, 0, 4]
//
// NOTE: Zero is NOT replaced (zero is not negative).
//
// TIME  : O(n)
// SPACE : O(1) — in-place, no extra array
// ═══════════════════════════════════════════════

import java.util.Arrays;

public class L1_ReplaceNegativesWithZero {

    public static void replaceNegatives(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;              // in-place overwrite
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {3, -1, 0, -5, 7, -2, 4};
        replaceNegatives(arr1);
        System.out.println("Test 1: " + Arrays.toString(arr1));
        // Expected: [3, 0, 0, 0, 7, 0, 4]

        int[] arr2 = {-1, -2, -3, -4};
        replaceNegatives(arr2);
        System.out.println("Test 2: " + Arrays.toString(arr2));
        // Expected: [0, 0, 0, 0]  (all replaced)

        int[] arr3 = {1, 2, 3, 4};
        replaceNegatives(arr3);
        System.out.println("Test 3: " + Arrays.toString(arr3));
        // Expected: [1, 2, 3, 4]  (no change — no negatives)

        int[] arr4 = {0, -1, 0, -2, 0};
        replaceNegatives(arr4);
        System.out.println("Test 4: " + Arrays.toString(arr4));
        // Expected: [0, 0, 0, 0, 0]  (zeros unchanged, negatives replaced)
    }
}
