# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```java []
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int bal = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (bal > 0) ans.append(c);
                bal++;
            } else {
                bal--;
                if (bal > 0) ans.append(c);
            }
        }
        return ans.toString();
    }
}
