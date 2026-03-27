// ═══════════════════════════════════════════════
// Problem  : Search Element Manually (Linear Search)
// Pattern  : Array Traversal — Linear Search
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// Check every element one by one from left to right.
// If found → return true (or index).
// If loop ends without finding → return false (or -1).
//
// This is LINEAR SEARCH — O(n).
// Works on ANY array (sorted or unsorted).
//
// WHY LEARN THIS before Binary Search?
// • Binary Search requires SORTED array
// • Linear Search works on everything
// • Interview will often say "unsorted array" → linear search
// • Shows you understand when NOT to use Binary Search
//
// DRY RUN:
// Input: [5, 3, 8, 1, 9, 2],  target = 9
//
//  i=0 → arr[0]=5  == 9? No
//  i=1 → arr[1]=3  == 9? No
//  i=2 → arr[2]=8  == 9? No
//  i=3 → arr[3]=1  == 9? No
//  i=4 → arr[4]=9  == 9? Yes → return true (index 4)
//
// DRY RUN (not found):
// Input: [5, 3, 8, 1, 9, 2],  target = 7
//
//  i=0..5 → no match
//  loop ends → return false (-1)
//
// TIME  : O(n) — worst case scan entire array
//         O(1) — best case element at index 0
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_SearchElement {

    // ── Returns true/false ───────────────────────
    public static boolean searchExists(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }

    // ── Returns index (-1 if not found) ─────────
    public static int searchIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 9, 2};

        System.out.println("Test 1 (target=9):  exists=" + searchExists(arr, 9)
                         + ", index=" + searchIndex(arr, 9));
        // Expected: exists=true, index=4

        System.out.println("Test 2 (target=5):  exists=" + searchExists(arr, 5)
                         + ", index=" + searchIndex(arr, 5));
        // Expected: exists=true, index=0  (first element)

        System.out.println("Test 3 (target=2):  exists=" + searchExists(arr, 2)
                         + ", index=" + searchIndex(arr, 2));
        // Expected: exists=true, index=5  (last element)

        System.out.println("Test 4 (target=7):  exists=" + searchExists(arr, 7)
                         + ", index=" + searchIndex(arr, 7));
        // Expected: exists=false, index=-1

        System.out.println("Test 5 (target=-1): exists=" + searchExists(arr, -1)
                         + ", index=" + searchIndex(arr, -1));
        // Expected: exists=false, index=-1
    }
}
