// ═══════════════════════════════════════════════
// Problem  : Find Second Largest Element
// Pattern  : Array Traversal — Two Variable Tracking
// Level    : L2 — Decision Making
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Track TWO variables simultaneously: first and second.
// Rules:
// • If arr[i] > first  → second = first, first = arr[i]
// • If arr[i] > second AND arr[i] != first → second = arr[i]
// The second condition ensures we don't count duplicates
// of the max as the second largest.
//
// IMPORTANT EDGE CASES:
// • All same elements → no second largest (return -1)
// • Only one element  → no second largest (return -1)
// • [5, 5, 3]         → second largest is 3, not 5
//
// DRY RUN:
// Input: [3, 7, 1, 9, 4, 9, 6]
//
//  first = INT_MIN, second = INT_MIN
//  i=0 → 3  > first(MIN)?  Yes → second=MIN, first=3
//  i=1 → 7  > first(3)?    Yes → second=3,   first=7
//  i=2 → 1  > first(7)?    No
//         1  > second(3)?   No
//  i=3 → 9  > first(7)?    Yes → second=7,   first=9
//  i=4 → 4  > first(9)?    No
//         4  > second(7)?   No
//  i=5 → 9  > first(9)?    No
//         9  == first(9)?   Skip (don't count duplicate max)
//  i=6 → 6  > first(9)?    No
//         6  > second(7)?   No
//
// Output: second = 7
//
// THIS PATTERN IS USED IN:
// • Second smallest  (flip comparison)
// • Top K elements   (extend to K variables → use Heap)
// • Kadane's         (track current + max simultaneously)
//
// TIME  : O(n)  — single pass
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L2_SecondLargest {

    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return -1;              // need at least 2 elements

        int first  = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;                     // old max becomes second
                first  = arr[i];                    // new max
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];                    // new second (not a dup of max)
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {

        System.out.println("Test 1: " + secondLargest(new int[]{3, 7, 1, 9, 4, 9, 6}));
        // Expected: 7

        System.out.println("Test 2: " + secondLargest(new int[]{5, 5, 5}));
        // Expected: -1  (all same, no second largest)

        System.out.println("Test 3: " + secondLargest(new int[]{1, 2}));
        // Expected: 1

        System.out.println("Test 4: " + secondLargest(new int[]{9}));
        // Expected: -1  (single element)

        System.out.println("Test 5: " + secondLargest(new int[]{5, 5, 3}));
        // Expected: 3   (second largest, not duplicate 5)

        System.out.println("Test 6: " + secondLargest(new int[]{1, 2, 3, 4, 5}));
        // Expected: 4   (second largest at end)
    }
}
