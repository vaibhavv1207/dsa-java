// ═══════════════════════════════════════════════
// Problem  : Index Based Traversal
// Pattern  : Array Traversal — Index vs Value
// Level    : L1 — Basic Traversal
// Difficulty: Easy
// ═══════════════════════════════════════════════
//
// INTUITION:
// The most important mental model in arrays:
//
//   INDEX  →  position (where you are)
//   VALUE  →  arr[i]   (what is stored there)
//
// Most beginners confuse i and arr[i].
// This file makes the distinction crystal clear.
//
// Real interview usage of index vs value:
// • "Find element equal to its index"  → arr[i] == i
// • "Replace element at index i"       → arr[i] = newValue
// • Prefix sum                         → pref[i] = pref[i-1] + arr[i]
// • Two pointers                       → move i and j based on values
//
// DRY RUN:
// Input: [40, 10, 50, 20, 30]
//
//  i=0 → index=0, value=40
//  i=1 → index=1, value=10
//  i=2 → index=2, value=50
//  i=3 → index=3, value=20
//  i=4 → index=4, value=30
//
// Find elements where arr[i] > i * 10:
//  i=0 → 40 > 0  ✓
//  i=1 → 10 > 10 ✗
//  i=2 → 50 > 20 ✓
//  i=3 → 20 > 30 ✗
//  i=4 → 30 > 40 ✗
// Result: indices 0 and 2
//
// TIME  : O(n)
// SPACE : O(1)
// ═══════════════════════════════════════════════

public class L1_IndexBasedTraversal {

    // ── Print index and value side by side ──────
    public static void printIndexValue(int[] arr) {
        System.out.println("  Index | Value");
        System.out.println("  ------|------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("    " + i + "   |  " + arr[i]);
        }
    }

    // ── Find elements where arr[i] == i (fixed point) ──
    public static void findFixedPoints(int[] arr) {
        System.out.print("  Fixed points (arr[i]==i): ");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                System.out.print("index=" + i + " ");
                found = true;
            }
        }
        if (!found) System.out.print("none");
        System.out.println();
    }

    // ── Access by specific index ─────────────────
    public static void accessByIndex(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            System.out.println("  arr[" + index + "] = " + arr[index]);
        } else {
            System.out.println("  Index " + index + " is out of bounds!");
        }
    }

    // ── Quick Test ──────────────────────────────
    public static void main(String[] args) {

        int[] arr1 = {40, 10, 50, 20, 30};
        System.out.println("Test 1 — Index & Value:");
        printIndexValue(arr1);

        System.out.println("\nTest 2 — Fixed Points:");
        int[] arr2 = {0, 2, 2, 3, 5};
        findFixedPoints(arr2);
        // Expected: index=0, index=2, index=3

        int[] arr3 = {5, 4, 3, 2, 1};
        findFixedPoints(arr3);
        // Expected: none

        System.out.println("\nTest 3 — Access by Index:");
        accessByIndex(arr1, 2);    // Expected: arr[2] = 50
        accessByIndex(arr1, 0);    // Expected: arr[0] = 40
        accessByIndex(arr1, 10);   // Expected: out of bounds
    }
}
