class Solution:
    def finalPrices(self, prices):
        n = len(prices)
        ans = [0] * n
        stack = []

        for i in range(n - 1, -1, -1):
            while stack and stack[-1] > prices[i]:
                stack.pop()

            if stack:
                ans[i] = prices[i] - stack[-1]
            else:
                ans[i] = prices[i]

            stack.append(prices[i])

        return ans
