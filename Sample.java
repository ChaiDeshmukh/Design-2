// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

1) Design HashSet



2) Implement Queue using Stacks

Time Complexity :  push() -> O(1)
					pop() -> O(N)
					peek() -> O(N)
					IsEmpty() -> O(1)
Space Complexity : O(N) since we are using another data structure for calculations
Did this code successfully run on Leetcode : Yes

Approach:

1. Lets take two stacks, 1 for push and another one for pop & peek
2. for every push operation, we push the elements in stack1
3. for every pop operation, check if stack2 is empty then transfer all the elements from stack1 to stack2 and then pop from stack2.
