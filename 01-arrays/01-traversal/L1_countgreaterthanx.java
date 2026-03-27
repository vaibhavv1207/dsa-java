// ═══════════════════════════════════════════════
// Problem  : Count Numbers Greater Than X
// Pattern  : Array Traversal — Threshold Counter
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Standard conditional counter.
// Check each element against threshold X.
// Increment counter only when condition is met.
//
// This is the base template for ALL threshold problems:
// • Count elements > X
// • Count elements >= X
// • Count elements < X
// • Count elements in range [L, R]   ← next problem
//
// DRY RUN:
// Input: [3, 7, 1, 9, 4, 6],  X = 5
//
//  i=0 → arr[0]=3  > 5? No
//  i=1 → arr[1]=7  > 5? Yes → count=1
//  i=2 → arr[2]=1  > 5? No
//  i=3 → arr[3]=9  > 5? Yes → count=2
//  i=4 → arr[4]=4  > 5? No
//  i=5 → arr[5]=6  > 5? Yes → count=3
//
// Output: 3
//
// VARIANTS (change only the condition):
// >=X  →  if (arr[i] >= x)
//  <X  →  if (arr[i] < x)
// ==X  →  if (arr[i] == x)   ← frequency of X
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_CountGreaterThanX {

    public static int countGreater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {3, 7, 1, 9, 4, 6};

        System.out.println("Test 1 (X=5): " + countGreater(arr, 5));
        // Expected: 3  (elements: 7, 9, 6)

        System.out.println("Test 2 (X=0): " + countGreater(arr, 0));
        // Expected: 6  (all positive)

        System.out.println("Test 3 (X=9): " + countGreater(arr, 9));
        // Expected: 0  (none greater than max)

        System.out.println("Test 4 (X=3): " + countGreater(arr, 3));
        // Expected: 4  (elements: 7, 9, 4, 6)

        System.out.println("Test 5 (X=-1): " + countGreater(new int[]{-5, -2, 0, 3}, -1));
        // Expected: 2  (elements: 0, 3)
    }
}
