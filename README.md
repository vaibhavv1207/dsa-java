# 🚀 DSA in Java — Interview Preparation

A structured, pattern-focused Data Structures & Algorithms repository built for **placement and interview preparation**. Every solution is written in Java with clean explanations and pattern tags to make revision fast.

---

## 📊 Progress Tracker

| Phase | Topic | Status |
|-------|-------|--------|
| 01 | Arrays | ✅ Complete |
| 02 | Strings | 🔄 In Progress |
| 03 | Recursion | 🔜 Up Next |
| 04 | Linked List + Stack & Queue | ⬜ Pending |
| 05 | Trees + Heap | ⬜ Pending |
| 06 | Graphs + Binary Search | ⬜ Pending |
| 07 | Dynamic Programming | ⬜ Pending |

---

## 🗂️ Repository Structure

```
dsa-java/
│
├── 01-arrays/
│   ├── TwoSum.java
│   ├── MaxSubarrayKadane.java
│   ├── SlidingWindowMaximum.java
│   └── ...
│
├── 02-strings/
│   ├── LongestSubstringWithoutRepeat.java
│   ├── ValidAnagram.java
│   └── ...
│
├── 03-recursion/
│   ├── Fibonacci.java
│   ├── Subsets.java
│   ├── Permutations.java
│   └── ...
│
├── 04-linked-list/
│   ├── ReverseLinkedList.java
│   ├── DetectCycle.java
│   └── ...
│
├── 05-stack-queue/
├── 06-trees/
├── 07-heap/
├── 08-graphs/
├── 09-binary-search/
└── 10-dynamic-programming/
```

---

## 🧠 Patterns Covered

Each solution is tagged with its core pattern at the top of the file.

| Pattern | Where Used |
|---------|-----------|
| Two Pointers | Arrays, Strings, Linked List |
| Sliding Window | Arrays, Strings |
| Kadane's Algorithm | Arrays (max subarray) |
| HashMap / HashSet | Arrays, Strings |
| Prefix Sum | Arrays |
| Recursion + Backtracking | Recursion, Trees, Graphs |
| Fast & Slow Pointers | Linked List, Cycle detection |
| Monotonic Stack | Stack problems |
| BFS / DFS | Trees, Graphs |
| Binary Search on Answer | Binary Search |
| Top-K (Heap) | Heap / Priority Queue |
| Memoization / Tabulation | Dynamic Programming |

---

## 📁 How Each File Is Organized

Every `.java` file follows this structure for easy revision:

```java
// Problem: Subsets
// Pattern: Recursion — include / exclude at each step
// Difficulty: Medium
// Link: https://leetcode.com/problems/subsets/
//
// Recursion Tree:
//              []
//           /      \
//        [1]         []
//       /   \       /   \
//    [1,2]  [1]  [2]    []
//    /  \   ...  ...   ...
// [1,2,3][1,2]
//
// Time: O(2^n)  Space: O(n)

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void solve(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        // Include nums[index]
        current.add(nums[index]);
        solve(nums, index + 1, current, result);

        // Exclude nums[index]
        current.remove(current.size() - 1);
        solve(nums, index + 1, current, result);
    }
}
```

---

## ✅ Phase 1 — Arrays (Complete)

| Problem | Pattern | Difficulty |
|---------|---------|-----------|
| Two Sum | HashMap | Easy |
| Best Time to Buy and Sell Stock | Sliding Window | Easy |
| Maximum Subarray | Kadane's | Medium |
| Longest Subarray with Sum K | Prefix Sum + HashMap | Medium |
| Container With Most Water | Two Pointers | Medium |
| Trapping Rain Water | Two Pointers / Stack | Hard |
| Subarray Sum Equals K | Prefix Sum + HashMap | Medium |
| 3Sum | Two Pointers | Medium |

---

## 🔄 Phase 2 — Strings (In Progress)

| Problem | Pattern | Difficulty |
|---------|---------|-----------|
| Valid Anagram | HashMap | Easy |
| Longest Substring Without Repeating Characters | Sliding Window | Medium |
| Minimum Window Substring | Sliding Window | Hard |
| Group Anagrams | HashMap | Medium |
| Longest Palindromic Substring | Expand Around Center | Medium |

---

## 🔜 Phase 3 — Recursion (Up Next)

> **Why Recursion before Linked List & Trees?**
> Recursion is the backbone of Linked List (reverse, merge), Trees (DFS, traversals),
> and DP (memoization). Mastering it here makes every phase after this significantly easier.

### Core Concepts

| Concept | Key Idea |
|---------|---------|
| Base case + recursive case | Every recursion needs a stopping condition |
| Call stack mental model | Visualize the recursion tree before coding |
| Include / Exclude pattern | Foundation for subsets and backtracking |
| Memoization preview | Recursion + caching = Dynamic Programming |

### Problem List

| Problem | Pattern | Difficulty |
|---------|---------|-----------|
| Factorial / Fibonacci | Basic recursion | Easy |
| Pow(x, n) | Divide & Conquer recursion | Medium |
| Print 1 to N (no loop) | Linear recursion | Easy |
| Reverse an Array | Recursion on arrays | Easy |
| Check if Array is Sorted | Recursion on arrays | Easy |
| Binary Search (recursive) | Divide & Conquer | Easy |
| String Permutations | Include/Exclude + swap | Medium |
| Subsets (LC 78) | Include/Exclude | Medium |
| Permutations (LC 46) | Backtracking | Medium |
| Letter Combinations (LC 17) | Backtracking | Medium |
| Merge Sort | Divide & Conquer | Medium |
| Quick Sort | Divide & Conquer | Medium |

---

## ⬜ Phase 4 — Linked List + Stack & Queue

- Reverse a Linked List (iterative + recursive)
- Detect Cycle — Floyd's Algorithm
- Merge Two Sorted Lists
- Find Middle of Linked List
- LRU Cache
- Monotonic Stack problems
- Sliding Window Maximum using Deque

---

## ⬜ Phase 5 — Trees + Heap

- Binary Tree DFS (pre / in / post order)
- BFS / Level Order Traversal
- Lowest Common Ancestor
- Binary Search Tree operations
- Top-K Frequent Elements (Heap)
- Kth Largest Element

---

## ⬜ Phase 6 — Graphs + Binary Search

- Binary Search classic + on answer
- Graph DFS / BFS
- Topological Sort
- Union Find (DSU)
- Dijkstra's Algorithm

---

## ⬜ Phase 7 — Dynamic Programming

- 1D DP — Climbing Stairs, House Robber
- 2D DP — Grid paths, LCS
- Knapsack patterns
- DP on Strings
- Interval DP

---

## 🛠️ How to Run

**Prerequisites:** Java 11+ and any IDE (IntelliJ IDEA recommended)

```bash
# Clone the repo
git clone https://github.com/your-username/dsa-java.git

# Navigate to any topic folder
cd dsa-java/01-arrays

# Compile and run
javac TwoSum.java
java TwoSum
```

---

## 📚 Resources

- [LeetCode](https://leetcode.com) — Primary problem source
- [NeetCode 150](https://neetcode.io) — Curated list mapped to patterns
- [Striver's A2Z DSA Sheet](https://takeuforward.org/strivers-a2z-dsa-course) — Structured roadmap

---

## 🎯 Goal

Solve **300+ problems** across all major DSA topics with clean, pattern-based solutions to crack **product-based company placements**.

---

> 💡 **Tip:** Star this repo and check back regularly — it's updated daily with new solutions.
