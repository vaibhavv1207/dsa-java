// ═══════════════════════════════════════════════
// Problem  : Last Occurrence of an Element
// Pattern  : Array Traversal — Update on Match
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Traverse the ENTIRE array.
// Every time you find the target, update the answer index.
// Do NOT break early — we want the LAST match.
// At the end, answer holds the last found index.
//
// KEY DIFFERENCE vs First Occurrence:
// First → break as soon as found (stop early)
// Last  → keep updating, never break (scan all)
//
// DRY RUN:
// Input: [4, 2, 7, 2, 9, 2, 5],  target = 2
//
//  result = -1   (not found yet)
//  i=0 → arr[0]=4  == 2? No
//  i=1 → arr[1]=2  == 2? Yes → result=1
//  i=2 → arr[2]=7  == 2? No
//  i=3 → arr[3]=2  == 2? Yes → result=3  (update)
//  i=4 → arr[4]=9  == 2? No
//  i=5 → arr[5]=2  == 2? Yes → result=5  (update again)
//  i=6 → arr[6]=5  == 2? No
//
// Output: 5
//
// RETURN -1 if not found (standard convention).
//
// CONNECTS TO:
// • Count occurrences = lastIndex - firstIndex + 1 (if sorted)
// • Binary Search: last occurrence (Binary Search L1)
// • Maximum distance between two equal elements (HashMap L5)
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_LastOccurrence {

    public static int lastOccurrence(int[] arr, int target) {
        int result = -1;                     // -1 means not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i;                  // keep updating — don't break
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 2, 9, 2, 5};

        System.out.println("Test 1 (target=2): " + lastOccurrence(arr, 2));
        // Expected: 5

        System.out.println("Test 2 (target=4): " + lastOccurrence(arr, 4));
        // Expected: 0  (appears only once, at start)

        System.out.println("Test 3 (target=5): " + lastOccurrence(arr, 5));
        // Expected: 6  (last element)

        System.out.println("Test 4 (target=99): " + lastOccurrence(arr, 99));
        // Expected: -1  (not found)

        System.out.println("Test 5 (target=3): " + lastOccurrence(new int[]{3, 3, 3, 3}, 3));
        // Expected: 3  (last index when all elements are same)
    }
}
