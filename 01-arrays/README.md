# 📦 Arrays — Complete Question Bank

> **Total Questions: 290+** across 6 patterns
> **Status: ✅ Complete**
> **Goal: Cover every pattern needed for Adobe MTS-1, Amazon SDE-1, and product-based placements**

---

## 📋 Pattern Overview

| # | Pattern | Questions | Status |
|---|---------|-----------|--------|
| 1 | Array Traversal | 55 | ✅ Done |
| 2 | Two Pointers | 98 | ✅ Done |
| 3 | Sliding Window | 52 | ✅ Done |
| 4 | Prefix Sum | 50 | ✅ Done |
| 5 | HashMap / HashSet | 50 | ✅ Done |
| 6 | Kadane's Algorithm | 27 | ✅ Done |
| 7 | Binary Search | 73 | ✅ Done |

---

## 🗂️ Folder Structure

```
01-arrays/
│
├── 01-traversal/
│   ├── L1_PrintElements.java
│   ├── L1_SumOfElements.java
│   ├── L2_CheckSorted.java
│   ├── L2_SecondLargest.java
│   ├── L3_LeadersInArray.java
│   ├── L4_ProductExceptSelf.java
│   └── ...
│
├── 02-two-pointers/
│   ├── L1_ReverseArray.java
│   ├── L1_PairSumClosestX.java
│   ├── L2_TwoSumSorted.java
│   ├── L3_RemoveDuplicates.java
│   ├── L4_SlowFastMajority.java
│   ├── L5_ThreeSum.java
│   ├── L5_DutchNationalFlag.java
│   └── ...
│
├── 03-sliding-window/
│   ├── L1_MaxSumSubarrayK.java
│   ├── L1_FirstNegativeInWindow.java
│   ├── L2_LongestSubarraySumK.java
│   ├── L3_ExactlyKDistinct.java
│   ├── L4_SubarrayProductLessK.java
│   └── ...
│
├── 04-prefix-sum/
│   ├── L1_BuildPrefixArray.java
│   ├── L2_EquilibriumIndex.java
│   ├── L2_SubarraySumK.java
│   ├── L3_SumDivisibleByK.java
│   ├── L4_EqualZerosOnes.java
│   └── ...
│
├── 05-hashmap/
│   ├── L1_FrequencyCount.java
│   ├── L2_TwoSum.java
│   ├── L3_LongestSubarraySumK.java
│   ├── L4_ExactlyKDistinctWindow.java
│   └── ...
│
├── 06-kadane/
│   ├── L1_MaxSubarraySum.java
│   ├── L2_MinSubarraySum.java
│   ├── L3_MaxCircularSubarray.java
│   ├── L4_MaxProductSubarray.java
│   └── ...
│
└── 07-binary-search/
    ├── L1_BinarySearchIterative.java
    ├── L2_FindPeakElement.java
    ├── L3_SearchRotatedArray.java
    ├── L4_AllocateMinPages.java
    ├── L4_AggressiveCows.java
    └── ...
```

---

## 📁 File Template (Follow This for Every Problem)

```java
// Problem: Maximum Subarray Sum
// Pattern: Kadane's Algorithm — local vs global optimal
// Difficulty: Medium
// Link: https://leetcode.com/problems/maximum-subarray/
// Time: O(n)  Space: O(1)
//
// Key Insight:
// At every index, ask — does the previous sum HELP or HURT me?
// If it hurts (negative), reset. If it helps, continue.
//
// Dry Run: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//   i=0: curr=-2,  max=-2
//   i=1: curr=1,   max=1   ← reset (prev hurt)
//   i=2: curr=-2,  max=1
//   i=3: curr=4,   max=4   ← reset again
//   i=4: curr=3,   max=4
//   i=5: curr=5,   max=5
//   i=6: curr=6,   max=6  ← answer

class MaxSubarraySum {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
```

---

## 🔵 Pattern 1 — Array Traversal

> **Core Skill:** Loop control, index vs value, multi-variable tracking
> **Total: 55 questions**

### Level 1 — Basic Traversal (20 Questions)

| # | Problem | Key Concept |
|---|---------|-------------|
| 1 | Print all elements | Basic loop |
| 2 | Sum of elements | Accumulator |
| 3 | Count elements | Counter |
| 4 | Maximum element | Track max |
| 5 | Minimum element | Track min |
| 6 | Count even / odd | Modulo condition |
| 7 | Count positive / negative | Sign check |
| 8 | Index based traversal | i vs arr[i] |
| 9 | Reverse printing | Backward loop |
| 10 | Multiplication of all elements | Running product |
| 11 | Average of elements | Sum / count |
| 12 | Count numbers greater than X | Threshold check |
| 13 | Count numbers in a range [L, R] | Double condition |
| 14 | Last occurrence of element | Update on match |
| 15 | First occurrence of element | Break on match |
| 16 | Search element manually | Linear search |
| 17 | Replace negatives with 0 | In-place update |
| 18 | Square every element | Transform |
| 19 | Frequency of each element (simple) | Frequency array |
| 20 | Find missing number from 1 to N | Expected sum trick |

### Level 2 — Decision Making & Counters (15 Questions)

| # | Problem | Key Concept |
|---|---------|-------------|
| 21 | Check if array is sorted | Adjacent comparison |
| 22 | Check if array is strictly increasing | Strict vs non-strict |
| 23 | Find second largest | Two-variable tracking |
| 24 | Find second smallest | Two-variable tracking |
| 25 | Count duplicates | Nested scan / freq |
| 26 | Find all duplicates | Store seen elements |
| 27 | Count unique elements | HashSet size |
| 28 | Remove duplicates (without new array) | In-place write |
| 29 | Find element with highest frequency | Freq map + max |
| 30 | Find element with lowest frequency | Freq map + min |
| 31 | Count pairs where a[i] > a[j] | Nested compare |
| 32 | Compare adjacent elements | i vs i+1 |
| 33 | Check if alternating even and odd | Parity pattern |
| 34 | Find longest increasing sequence (not subarray) | Track streak |
| 35 | Find first repeated element | Seen set |

### Level 3 — Advanced Traversal Thinking (15 Questions)

| # | Problem | Key Concept |
|---|---------|-------------|
| 36 | Leaders in array | Right-to-left max |
| 37 | Majority element (brute) | O(n²) count |
| 38 | Equilibrium index | Left sum = right sum |
| 39 | Reverse array manually | Swap from ends |
| 40 | Rotate left / right | Reverse trick |
| 41 | Count inversion pairs | Nested comparison |
| 42 | Check palindrome array | Mirror comparison |
| 43 | Separate even & odd | Partition |
| 44 | Move all zeros to end | Write pointer |
| 45 | Shift negatives to left | Partition |
| 46 | Find minimum distance between two numbers | Track last index |
| 47 | Remove element inplace | Write pointer |
| 48 | Replace element with next greatest | Right scan |
| 49 | Count elements greater than right side | Same as leaders |
| 50 | Find element equal to its index | Linear scan |

### Level 4 — Company Style Traversal (10 Questions)

| # | Problem | Key Concept |
|---|---------|-------------|
| 51 | Product of all except self (brute) | Nested product |
| 52 | Find missing + duplicate | XOR / sum trick |
| 53 | Find smallest missing positive | Mark visited |
| 54 | Rearrange array alternatively | Index mapping |
| 55 | Trapping rain water (brute) | Left/right max arrays |
| 56 | Stock buy sell (brute) | Min so far |
| 57 | Equilibrium index problem | Running sums |
| 58 | Largest sum contiguous (brute) | O(n²) subarray |
| 59 | Check if array contains duplicates | Set trick |
| 60 | Count maximum consecutive 1s | Counter reset |

### Level 5 — Master Logic (10 Questions)

| # | Problem | Key Concept |
|---|---------|-------------|
| 61 | Find repeating element | Index marking |
| 62 | Count frequency using O(1) space | Index negation trick |
| 63 | Replace every element by its rank | Sort + map |
| 64 | Check if palindrome after operations | Simulate + check |
| 65 | Rearrange with index mapping | Cyclic replacement |
| 66 | Smallest subarray greater than K (brute) | O(n²) window |
| 67 | Sum of all subarrays (brute) | Contribution formula |
| 68 | Remove multiple duplicates | Write pointer |
| 69 | Count possible triangles | Sort + scan |
| 70 | Check if reverse makes array sorted | Reverse + verify |

#### LeetCode — Traversal Focus

| LeetCode | Problem | Difficulty |
|----------|---------|-----------|
| LC 485 | Max Consecutive Ones | Easy |
| LC 1295 | Even Digit Numbers | Easy |
| LC 26 | Remove Duplicates | Easy |
| LC 1929 | Concatenation of Array | Easy |
| LC 977 | Squares of Sorted Array | Easy |
| LC 121 | Stock Buy Sell | Medium |
| LC 169 | Majority Element | Medium |
| LC 283 | Move Zeros | Easy |
| LC 238 | Product Except Self | Medium |
| LC 229 | Majority Element II | Medium |
| LC 42 | Trapping Rain Water | Hard |
| LC 134 | Gas Station | Medium |

---

## 🔵 Pattern 2 — Two Pointers

> **Core Skill:** Reduce O(n²) → O(n), pointer movement logic
> **Total: 98 questions**

### Pointer Types You Must Know

| Type | Use When | Examples |
|------|---------|---------|
| Left–Right | Sorted array, shrink from both ends | Pair sum, palindrome, reverse |
| Slow–Fast (Runner) | Detect cycle, find middle, skip elements | Floyd's cycle, remove dups |
| Three Pointer | Triplets, K-sum, merge | 3Sum, Dutch National Flag |
| Same Direction | Maintain condition, sliding window | Remove element, partition |
| Sort + Two Pointer | Need sorted property first | 2-sum unique pairs, 3Sum |
| In-place Overwrite | O(1) space write-read | Move zeros, compress array |

### Level 1 — Two Pointer Basics (22 Questions)

| # | Problem | Pointer Type |
|---|---------|-------------|
| 1 | Reverse an array | Left–Right |
| 2 | Check palindrome array | Left–Right |
| 3 | Compare symmetric pairs and report mismatches | Left–Right |
| 4 | Find first mismatch index from both ends | Left–Right |
| 5 | Count pairs with even sum | Left–Right |
| 6 | Count pairs with odd sum | Left–Right |
| 7 | Check if any pair sum = X (sorted) | Left–Right |
| 8 | Count pairs with difference = K | Left–Right |
| 9 | Pair with sum closest to X | Left–Right |
| 10 | Shift negatives left, positives right | In-place overwrite |
| 11 | Move zeros to end (in-place) | In-place overwrite |
| 12 | Count inversions (easy version) — use Merge Sort | — |
| 13 | Partition even / odd elements | In-place overwrite |
| 14 | Count increasing pairs — use Merge Sort | — |
| 15 | Merge two sorted arrays in-place | Three Pointer |
| 16 | Compare prefix and suffix sums | Left–Right |
| 17 | Check if array can become palindrome by one swap | Left–Right |
| 18 | Compress array using write-read pointer | Same Direction |
| 19 | Remove element = val (overwrite pointer) | Same Direction |
| 20 | Count pairs where product < K | Left–Right |
| 21 | Count pairs where sum > K | Left–Right |
| 22 | Count symmetric elements except middle | Left–Right |

### Level 2 — Left–Right Pointer on Sorted Arrays (24 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 23 | Two Sum (sorted) | Classic |
| 24 | Two Sum — all unique pairs | Handle duplicates |
| 25 | All unique pairs with exact sum | Same as 24 |
| 26 | Pair with smallest sum | Smallest + Second Smallest |
| 27 | Pair with largest sum < target | Adjust right |
| 28 | Closest pair sum to target | Track min diff |
| 29 | Maximum difference pair | Max - min |
| 30 | Minimum difference pair | Adjacent after sort |
| 31 | Count pairs with sum < target | Move left |
| 32 | Count pairs with sum ≤ target | Add equal sign |
| 33 | Find all pairs with difference = D | Sort + scan |
| 34 | Pythagorean triplet (sort + pointers) | a²+b²=c² |
| 35 | Count pairs with sum in range [L, R] | Double count |
| 36 | Partition by absolute value | Extra logic |
| 37 | Find K closest numbers | Window shrink |
| 38 | BerSU Ball (pairing by value diff) | Classic greedy pair |
| 39 | Pairing to minimize maximum difference | Sort + pair ends |
| 40 | Return pair indices (not values) | Same as Two Sum |
| 41 | Boats to save people (two pointers + greedy) | Greedy pair |
| 42 | Pair smallest with largest repeatedly | Sort + ends |
| 43 | Minimize gap problems | Sort + adjacent |
| 44 | Remove duplicates from sorted array | Write pointer |
| 45 | Keep only up to 2 duplicates | Count condition |
| 46 | Remove duplicates keeping first & last | Edge case |

### Level 3 — Same Direction / Write-Read Pointer (18 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 47 | Remove duplicates — LC 26 | Classic |
| 48 | Remove element — LC 27 | Classic |
| 49 | Remove all duplicates, keep one | Write pointer |
| 50 | Remove duplicates, keep two | Count check |
| 51 | Move non-zeros to front | Swap-based |
| 52 | Compress array with counts | Read + write |
| 53 | Copy array in-place | Overwrite |
| 54 | Segregate multiples of K | Condition-based write |
| 55 | In-place insertions during scan | Shift + insert |
| 56 | Replace arr[i] using another index | Sync pointers |
| 57 | Count runs of equal values | Streak counter |
| 58 | Merge sorted arrays (read/write pointers) | Two-source merge |
| 59 | In-place stable deduplication | Order-preserving |
| 60 | In-place shifting without extra space | Rotation by K |
| 61 | Separate even/odd index values | Already done |
| 62 | Remove consecutive duplicates (array version) | Stack-like logic |
| 63 | Partition around pivot (two forward pointers) | Lomuto partition |
| 64 | Spread value using pointer simulation | Fill pattern |

### Level 4 — Slow–Fast / Runner (Array Only) (18 Questions)

> ⚠️ Linked List based questions (cycle detection, middle node) are excluded here

| # | Problem | Key Note |
|---|---------|---------|
| 65 | Find middle index (array simulation) | Fast moves 2x |
| 66 | Detect cycle in index mapping | Floyd's cycle |
| 67 | Floyd cycle detection on array mapping | Floyd's cycle |
| 68 | Find duplicate using cycle method | Floyd's cycle |
| 69 | Find entry point of cycle | Floyd's cycle |
| 70 | Skip indices pattern in-place | Jump pointer |
| 71 | Detect repeated numeric pattern | Window compare |
| 72 | Compress using fast/slow | Slow writes, fast reads |
| 73 | Longest segment of equal values | Streak tracking |
| 74 | Majority element (Boyer-Moore) | Vote algorithm |
| 75 | Second majority element | Two-candidate BM |
| 76 | Fix array skipping invalid positions | Conditional skip |
| 77 | Detect loop in jump array | Floyd's cycle |
| 78 | First unique element (runner idea) | Freq + scan |
| 79 | Longest streak of equal values | Reset on mismatch |
| 80 | Smallest cycle length detection | Phase comparison |
| 81 | In-place duplicate marking (index trick) | Negate at index |
| 82 | Retain last N occurrences only | Overwrite window |

### Level 5 — Advanced Two Pointers (16 Questions)

#### Triplets / 3-Pointer

| # | Problem | Key Note |
|---|---------|---------|
| 83 | 3Sum — unique triplets | Sort + L-R inside loop |
| 84 | 3Sum closest | Track min diff |
| 85 | Count triplets with sum < K | Count on valid |
| 86 | Count strictly increasing triplets | i < j < k |
| 87 | Triplet with minimal (max − min) | Sort + adjacent |
| 88 | Merge 3 sorted arrays | 3-pointer pick |
| 89 | Smallest range covering 3 arrays | Heap + pointer |

#### Partition / Greedy

| # | Problem | Key Note |
|---|---------|---------|
| 90 | Dutch National Flag (0, 1, 2) | Classic DNF |
| 91 | Sort negative / zero / positive | DNF variant |
| 92 | Partition array around pivot | Lomuto / Hoare |

#### Window / Feasibility

| # | Problem | Key Note |
|---|---------|---------|
| 93 | Smallest unsorted subarray | Boundary scan |
| 94 | Check if reversing one subarray sorts array | Boundary scan |
| 95 | Minimize maximum difference after pairing | Sort + pair ends |
| 96 | K closest numbers | Binary search + window |
| 97 | Container with most water | Classic L-R |
| 98 | Trapping rain water (two-pointer) | L-R with min tracking |

---

## 🔵 Pattern 3 — Sliding Window

> **Core Skill:** Fixed and variable window, shrink logic, constraint-based expansion
> **Total: 52 questions**

### Level 1 — Fixed Window (15 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 1 | Maximum sum subarray of size K | Add right, remove left |
| 2 | Minimum sum subarray of size K | Same |
| 3 | First negative number in every window | Queue / Deque → O(n) |
| 4 | Count windows with sum > X | Threshold check |
| 5 | Count windows with sum < X | Threshold check |
| 6 | Product of window size K | Multiply / divide |
| 7 | Maximum product of window size K | Track max |
| 8 | Count evens in every window | Even condition |
| 9 | Check if window is sorted | Adjacent check |
| 10 | Window sum divisible by M | Use HashMap for variable length |
| 11 | Window sum closest to target | Track min diff |
| 12 | Index of maximum-sum window | Track index |
| 13 | Window with max number of 1s | Count 1s |
| 14 | Window with equal 0s and 1s (binary array) | Count trick |
| 15 | Window where (max − min) ≤ K | Deque for max & min |

### Level 2 — Variable Window (11 Questions)

> **Key Rule:** Shrink when constraint violated. Think: when NOT to shrink.

| # | Problem | Key Note |
|---|---------|---------|
| 16 | Longest subarray with sum ≤ K | Non-negative only |
| 17 | Shortest subarray with sum ≥ K | LC 209 |
| 18 | Number of subarrays with sum < K | Count on expand |
| 19 | Longest subarray with at most K odd numbers | Count odds |
| 20 | Subarray with exactly K odd numbers | atMost(K) - atMost(K-1) |
| 21 | Count subarrays with at most K distinct numbers | HashMap |
| 22 | Count subarrays with exactly K distinct numbers | atMost(K) - atMost(K-1) |
| 23 | Maximum consecutive ones with K flips | Track zeros flipped |
| 24 | Longest subarray where max − min ≤ K | Deque for max & min |
| 25 | Longest subarray with no element > X | Shrink on violation |
| 26 | Longest subarray with elements in range [L, R] | Double condition |

### Level 3 — Frequency Window / HashMap (8 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 27 | Count subarrays with exactly K distinct values | atMost trick |
| 28 | Count subarrays with at most K distinct values | HashMap freq |
| 29 | Smallest window covering required numeric frequencies | Need map |
| 30 | Count windows where some value appears ≥ 2 times | Freq ≥ 2 |
| 31 | Count windows where every value appears ≤ 1 time | All freq = 1 |
| 32 | Window containing all values 1…N | Full coverage |
| 33 | Longest window where all frequencies are even | Freq % 2 == 0 |
| 34 | Smallest window where required values appear exactly once | Classic |

### Level 4 — Advanced Sliding Window (9 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 35 | Count subarrays with product < K | Shrink when ≥ K |
| 36 | Shortest subarray with product > K | Expand + track |
| 37 | Window where gcd of all elements > 1 | Recompute gcd |
| 38 | Window where OR of values ≤ K | Bit tracking |
| 39 | Window where XOR of values ≤ K | XOR property |
| 40 | Longest subarray where bitcount ≤ limit | Bit count sum |
| 41 | Longest window which becomes constant by ≤ K changes | Freq max trick |
| 42 | Dual sliding window technique | Two windows at once |
| 43 | Window on circular array (wrap-around) | Double array trick |

### Level 5 — Company / LeetCode (9 Questions)

| LeetCode | Problem | Key Pattern |
|----------|---------|------------|
| LC 209 | Minimum size subarray sum | Variable window |
| LC 713 | Subarray product < K | Product window |
| LC 1004 | Maximum consecutive ones III | K flips |
| LC 930 | Binary subarrays with sum = target | atMost trick |
| LC 1493 | Longest subarray of 1s after deleting one element | K=1 flip |
| LC 239 | Sliding Window Maximum | Deque |
| LC 992 | Subarrays with K distinct values | atMost trick |
| LC 1658 | Min ops to reduce sum to zero | Reverse window |
| LC 1423 | Max points from cards | Reverse window |

---

## 🔵 Pattern 4 — Prefix Sum

> **Core Formula: `sum(l, r) = pref[r] − pref[l−1]`**
> **Use when:** Sliding Window fails (negatives, exact counts)
> **Total: 50 questions**

### Level 1 — Basics (10 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 1 | Build prefix sum array from given array | Foundation |
| 2 | Find sum from index 0 to i using prefix | O(1) query |
| 3 | Find sum of subarray [l, r] using formula | Core formula |
| 4 | Answer multiple range sum queries efficiently | Multiple queries |
| 5 | Check if prefix sum array is non-decreasing | All positives |
| 6 | Convert array into prefix sum array in-place | Overwrite |
| 7 | Given prefix sum, reconstruct original array | Reverse: a[i] = p[i] - p[i-1] |
| 8 | Verify correctness of a prefix sum array | Validate |
| 9 | Find prefix sum of absolute values | abs() transform |
| 10 | Find prefix sum of even-indexed elements only | Index filter |

### Level 2 — Core Interview Problems (10 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 11 | Find equilibrium index (left sum = right sum) | Total - right |
| 12 | Find all subarrays with sum = K (brute) | O(n²) with prefix |
| 13 | Count subarrays with sum = K | **Prefix + HashMap** |
| 14 | Find length of longest subarray with sum = K | Track first occurrence |
| 15 | Find starting and ending index of subarray with sum = K | HashMap index |
| 16 | Check if subarray with sum = K exists | Boolean return |
| 17 | Count subarrays with sum = 0 | Same as K=0 |
| 18 | Find longest subarray with sum = 0 | Classic |
| 19 | Count subarrays with sum < K | Prefix logic |
| 20 | Find maximum length subarray with sum ≤ K | Tricky variant |

### Level 3 — Divisibility & Mod Prefix (10 Questions)

> **Key Idea:** If `(prefixSum % K)` repeats → subarray divisible by K exists

| # | Problem | Key Note |
|---|---------|---------|
| 21 | Count subarrays with sum divisible by K | Mod map |
| 22 | Find longest subarray with sum divisible by K | First occurrence of mod |
| 23 | Count subarrays where sum % K = 0 | Same as 21 |
| 24 | Check if subarray exists with sum divisible by K | Boolean |
| 25 | Count subarrays with same remainder mod K | Group by remainder |
| 26 | Count subarrays where sum ≡ R (mod K) | Remainder match |
| 27 | Find longest subarray where sum ≡ R (mod K) | First occurrence |
| 28 | Sum divisible by K with negative numbers | Handle negative mod |
| 29 | Check if array can be split into two parts with equal sum | Total/2 check |
| 30 | Check if array can be split into three equal sum parts | Running sum |

### Level 4 — Prefix + Transformation / Frequency (10 Questions)

> **Key Trick:** Replace 0 with −1, then find subarray with sum = 0

| # | Problem | Key Note |
|---|---------|---------|
| 31 | Count subarrays with sum in range [L, R] | Count(≤R) - Count(≤L-1) |
| 32 | Count subarrays with sum ≤ K | Prefix trick |
| 33 | Count subarrays with sum ≥ K | Total - less |
| 34 | Count subarrays with equal number of 0s and 1s | Replace 0→-1 |
| 35 | Find longest subarray with equal 0s and 1s | Replace 0→-1 |
| 36 | Replace 0 with −1 and apply prefix sum logic | Transform |
| 37 | Count subarrays with equal even and odd elements | Replace: even→1, odd→-1 |
| 38 | Find longest subarray with equal even and odd | Same transform |
| 39 | Count subarrays with more 1s than 0s | Prefix > 0 |
| 40 | Find longest subarray with more positives than negatives | pos→1, neg→-1 |

### Level 5 — Advanced Prefix Sum (10 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 41 | Maximum size subarray with sum ≤ K (negatives allowed) | Hard variant |
| 42 | Minimum size subarray with sum ≥ K | Prefix + binary search |
| 43 | Count subarrays where prefix sum difference is constant | Classic pattern |
| 44 | Maximum difference between two prefix sums | Track min prefix |
| 45 | Prefix sum on circular array | Double array |
| 46 | Count subarrays whose average = K | Transform: arr[i] = arr[i] − K, then sum = 0 |
| 47 | Count subarrays with sum ≥ K (advanced) | Harder variant |
| 48 | Prefix sum with coordinate compression (concept) | Conceptual |
| 49 | Maximum sum submatrix using row prefix compression | 1D Kadane reuse |
| 50 | Minimum removals so array sum divisible by K | Mod + prefix |

---

## 🔵 Pattern 5 — HashMap / HashSet

> **Ask Before Every Problem:** What is my key? What is my value? Count or Index?
> **Total: 50 questions**

### Level 1 — HashMap Basics (14 Questions)

| # | Problem | Java Methods Used |
|---|---------|-----------------|
| 1 | Count frequency of each element | `put`, `getOrDefault` |
| 2 | Check if array contains duplicates | `HashSet.add` |
| 3 | Find first repeating element | `contains` |
| 4 | Find first non-repeating element | Freq map + scan |
| 5 | Count distinct elements | `HashSet.size` |
| 6 | Find element with maximum frequency | Freq map + max |
| 7 | Find element with minimum frequency | Freq map + min |
| 8 | Check if two arrays are equal (frequency based) | Compare maps |
| 9 | Find common elements in two arrays | `contains` |
| 10 | Find intersection of two arrays | Freq-based |
| 11 | Find union of two arrays | Add all to Set |
| 12 | Check if one array is subset of another | `containsAll` |
| 13 | Remove duplicates from array (using HashSet) | Set order preserved |
| 14 | Count elements appearing more than n/2 times | Freq map |

### Level 2 — Core HashMap Interview Problems (9 Questions)

| # | Problem | Key Logic |
|---|---------|----------|
| 15 | Two Sum (unsorted array) | Store complement |
| 16 | Count pairs with sum = K | For each, check K - arr[i] |
| 17 | Count pairs with difference = K | Check arr[i] + K |
| 18 | Check if pair with sum = K exists | Same as 16 |
| 19 | Find longest consecutive sequence | HashSet + expand |
| 20 | Find all pairs with given sum (unique pairs) | Set of pairs |
| 21 | Count pairs where a[i] = a[j], i < j | freq × (freq-1) / 2 |
| 22 | Find subarray with sum = 0 (existence) | Prefix sum map |
| 23 | Find start & end index of subarray with sum = 0 | Store first index |

### Level 3 — Prefix Sum + HashMap (11 Questions)

> **This is the most important level — Adobe & Amazon favorites**

| # | Problem | Key Map |
|---|---------|--------|
| 24 | Count subarrays with sum = K | map(prefixSum → count) |
| 25 | Longest subarray with sum = K | map(prefixSum → index) |
| 26 | Count subarrays with sum = 0 | K = 0 |
| 27 | Longest subarray with sum = 0 | K = 0 |
| 28 | Count subarrays with sum divisible by K | map(mod → count) |
| 29 | Longest subarray with sum divisible by K | map(mod → index) |
| 30 | Count subarrays where sum ≡ R (mod K) | Remainder match |
| 31 | Check if subarray with sum divisible by K exists | Boolean |
| 32 | Count subarrays with equal number of 0s and 1s | Replace 0→-1, sum=0 |
| 33 | Longest subarray with equal 0s and 1s | Same transform |
| 34 | Count subarrays with equal even and odd elements | Even→1, odd→-1 |

### Level 4 — HashMap + Sliding Window (8 Questions)

| # | Problem | Key Logic |
|---|---------|----------|
| 35 | Count subarrays with at most K distinct elements | Shrink when > K |
| 36 | Count subarrays with exactly K distinct elements | atMost(K) - atMost(K-1) |
| 37 | Longest subarray with at most K distinct elements | HashMap + shrink |
| 38 | Longest subarray with exactly K distinct elements | atMost trick |
| 39 | Count subarrays with at most K odd numbers | Count odds |
| 40 | Count subarrays with exactly K odd numbers | atMost trick |
| 41 | Longest subarray with freq of any element ≤ K | Max freq tracking |
| 42 | Smallest subarray with exactly K distinct elements | Shrink aggressively |

### Level 5 — Company-Style HashMap Problems (8 Questions)

| # | Problem | Company |
|---|---------|--------|
| 43 | Check if elements can form pairs divisible by K | Amazon |
| 44 | Count subarrays whose average = K | Adobe |
| 45 | Count number of good pairs (i < j, a[i] = a[j]) | Easy formula |
| 46 | Count subarrays with sum in range [L, R] | Google |
| 47 | Count subarrays where prefix sum difference is constant | Hard |
| 48 | Find maximum distance between two equal elements | First/last index |
| 49 | Find smallest subarray with maximum frequency element | Freq + window |
| 50 | Check if array can be split into two equal sum parts | Total/2 |

---

## 🔵 Pattern 6 — Kadane's Algorithm

> **Core Decision:** At every index — does previous sum HELP or HURT?
> **Rule:** `currentSum = max(arr[i], currentSum + arr[i])`
> **Total: 27 questions**

### Template (Write This From Memory)

```java
int currentSum = arr[0];
int maxSum = arr[0];
for (int i = 1; i < arr.length; i++) {
    currentSum = Math.max(arr[i], currentSum + arr[i]);
    maxSum = Math.max(maxSum, currentSum);
}
// Works even when ALL numbers are negative
```

### Level 1 — Basic Kadane (5 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 1 | Maximum subarray sum | Core template |
| 2 | Print maximum subarray (print elements) | Track sum only |
| 3 | Find starting and ending index of max sum subarray | Track start/end |
| 4 | Check if max subarray sum is positive or negative | Result check |
| 5 | Max subarray sum with all negative numbers | Works naturally |

### Level 2 — Variants (6 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 6 | Minimum subarray sum | Flip to min logic |
| 7 | Max subarray sum with at least one element | Already guaranteed |
| 8 | Max subarray sum with exactly K length | Kadane + window |
| 9 | Max subarray sum ≤ K | Track and compare |
| 10 | Max subarray sum after deleting one element | Pre/suffix arrays |
| 11 | Max subarray sum with at most one negative | Conditional reset |

### Level 3 — Circular Array (5 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 12 | Maximum circular subarray sum | Total - min subarray |
| 13 | Minimum circular subarray sum | Circular Kadane |
| 14 | Max sum of subarray in circular array (wrap + non-wrap) | max(normal, total - minSubarray) |
| 15 | Check if circular gives better sum than normal | Compare both |
| 16 | Max circular subarray sum with all negative | Edge case |

### Level 4 — Product / Difference Variants (5 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 17 | Maximum product subarray | Track max AND min |
| 18 | Minimum product subarray | Same logic |
| 19 | Maximum absolute subarray sum | abs(max) vs abs(min) |
| 20 | Maximum difference of subarray sums | Split + Kadane |
| 21 | Maximum alternating sum subarray | Track extra state |

### Level 5 — Company / Advanced Kadane (6 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 22 | Maximum sum rectangle in 2D matrix | Row-wise Kadane |
| 23 | Maximum sum subarray of size ≥ K | Prefix + Kadane |
| 24 | Max subarray sum in array repeated K times | Circular reasoning |
| 25 | Max subarray sum divisible by K | Prefix + mod |
| 26 | Max subarray sum after rearranging | Math thinking |
| 27 | Maximum sum increasing subarray | Kadane + increasing condition |
| +  | Maximum sum bitonic subarray | Left Kadane + Right Kadane |

---

## 🔵 Pattern 7 — Binary Search

> **Core Template:** `while (low <= high)` + correct `mid` calculation
> **Total: 73 questions**

### Level 1 — Basics (16 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 1 | Binary Search (Iterative) | Core template |
| 2 | Binary Search (Recursive) | Same logic |
| 3 | Find element in sorted array | Classic |
| 4 | Check if element exists | Boolean return |
| 5 | First occurrence of element | Move right → left |
| 6 | Last occurrence of element | Move left → right |
| 7 | Count occurrences of element | Last - First + 1 |
| 8 | Find lower bound of X | First position ≥ X |
| 9 | Find upper bound of X | First position > X |
| 10 | Find insertion position of X | Lower bound |
| 11 | Floor of X in sorted array | Last element ≤ X |
| 12 | Ceil of X in sorted array | First element ≥ X |
| 13 | Check if array is sorted | Linear scan |
| 14 | Find smallest element ≥ X | Ceil |
| 15 | Find largest element ≤ X | Floor |
| 16 | Find first and last index of element = X | Two binary searches |

### Level 2 — Variations on Sorted Arrays (13 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 17 | Find missing number in sorted array | Expected vs actual |
| 18 | Find first element greater than X | Upper bound |
| 19 | Find last element smaller than X | Floor variant |
| 20 | Find peak element (mountain array) | Compare mid & mid+1 |
| 21 | Find peak in unsorted array | Same as 20 |
| 22 | Find element in nearly sorted array | Check mid-1, mid, mid+1 |
| 23 | Find element in infinite sorted array | Doubling range |
| 24 | Search in array of unknown size | Doubling |
| 25 | Find index where arr[i] == i | Binary search on i - arr[i] |
| 26 | Find fixed point in sorted array | Same as 25 |
| 27 | Single element in sorted array (others appear twice) | Parity check |
| 28 | Count elements smaller than X | Lower bound index |
| 29 | Count elements greater than X | Total - upper bound |

### Level 3 — Rotated Sorted Array (10 Questions)

> **Key Skill:** Identify which half is sorted, then decide where target lies

| # | Problem | Key Note |
|---|---------|---------|
| 30 | Search in rotated sorted array (no duplicates) | Identify sorted half |
| 31 | Search in rotated sorted array (with duplicates) | Skip duplicates |
| 32 | Find minimum in rotated sorted array | Track left sorted |
| 33 | Find minimum in rotated sorted array II (duplicates) | Careful with dups |
| 34 | Find maximum in rotated sorted array | Opposite of min |
| 35 | Find number of rotations | Index of min |
| 36 | Find pivot index | Same as max index |
| 37 | Check if array is rotated and sorted | One break point |
| 38 | Find element in circularly sorted array | Same as rotated search |
| 39 | Find rotation count with duplicates | Handle edge cases |

### Level 4 — Binary Search on Answer ⭐ (19 Questions)

> **This is the most important level for interviews.**
> **Pattern:**
> ```
> low  = minimum possible answer
> high = maximum possible answer
> if feasible(mid) → high = mid - 1
> else             → low  = mid + 1
> ```

#### Minimize Maximum (Allocate Pages pattern)

| # | Problem | Feasibility Check |
|---|---------|-----------------|
| 40 | Allocate minimum number of pages | Can K students read within mid pages? |
| 41 | Book allocation | Same as above |
| 42 | Split array largest sum | Same logic |
| 43 | Capacity to ship packages within D days | Can we ship in D days with capacity mid? |
| 44 | Painters partition problem | Same as allocate pages |
| 45 | Minimum days to make M bouquets | Can we make M bouquets in mid days? |
| 46 | Minimize maximum workload | Same as allocate pages |
| 47 | Minimize largest subarray sum | Partition into K groups |
| 48 | Find smallest possible maximum value | Generic minimize-max |
| 49 | Minimum speed to arrive on time | Can we reach with speed mid? |
| 50 | Minimum limit of balls in a bag | Can we reduce max to mid? |
| 51 | Maximum value at given index in bounded array | Math + feasibility |
| 52 | Koko eating bananas | Can Koko finish in H hours at speed mid? |
| 53 | Find smallest divisor given threshold | Sum of ceil(arr[i]/mid) ≤ threshold? |

#### Maximize Minimum (Aggressive Cows pattern)

| # | Problem | Feasibility Check |
|---|---------|-----------------|
| 54 | Aggressive cows | Can we place C cows with min distance mid? |
| 55 | Find maximum minimum distance | Same as aggressive cows |
| 56 | Magnetic force between two balls | Same pattern |
| 57 | Maximum candies allocated to K children | Can K children each get mid candies? |
| 58 | Minimize maximum distance to gas station | Floating point binary search |

### Level 5 — Advanced / Company Level (16 Questions)

| # | Problem | Key Note |
|---|---------|---------|
| 59 | Median of two sorted arrays | Hard — binary search on partition |
| 60 | Kth smallest element in sorted array | Binary search + count |
| 61 | Kth smallest element in two sorted arrays | Merge concept |
| 62 | Find K closest elements | Binary search + window |
| 63 | Find smallest missing positive | Binary search idea |
| 64 | Search in bitonic array | Peak + two searches |
| 65 | Find maximum element in bitonic array | Peak element |
| 66 | Find local minimum | Binary search on slope |
| 67 | Square root of a number (integer) | BS on answer |
| 68 | Nth root of a number | BS + power check |
| 69 | Find minimum time to complete tasks | BS on answer |
| 70 | Find element with minimum difference | Floor + Ceil |
| 71 | Median in row-wise sorted matrix | BS on value |
| 72 | Kth smallest number in multiplication table | BS + count |
| 73 | Peak element in 2D matrix | Binary search on rows |

---

## 📌 Pattern Decision Cheat Sheet

> When you see a problem, ask these questions in order:

```
1. Does it say "maximum subarray" or "optimal contiguous segment"?
   → Kadane's Algorithm

2. Does it say "sorted array" + "find element / position"?
   → Binary Search

3. Does it say "minimize the maximum" or "maximize the minimum" + divide into K parts?
   → Binary Search on Answer

4. Does it involve range sum queries or "subarray with sum = K" with negatives?
   → Prefix Sum + HashMap

5. Does it involve counting subarrays with constraints (distinct, product, sum)?
   → Sliding Window (variable)

6. Does it involve a fixed window size K?
   → Sliding Window (fixed)

7. Does it involve pairs / triplets in sorted array?
   → Two Pointers (Left–Right)

8. Does it say "remove", "compress", "partition" in-place?
   → Two Pointers (Same Direction / In-place)

9. Does it say "duplicate", "frequency", "pair sum" in unsorted array?
   → HashMap / HashSet
```

---

## 📚 Resources Used

- [LeetCode](https://leetcode.com) — Primary problem source
- [NeetCode 150](https://neetcode.io) — Pattern-based curated list
- [Striver's A2Z DSA Sheet](https://takeuforward.org/strivers-a2z-dsa-course) — Structured roadmap

---

> 💡 **Revision Rule:** For every problem — dry run manually → write brute → optimize → write TC/SC → explain out loud → redo after 2 days.
