 Final Prices With a Special Discount in a Shop
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer array prices where prices[i] is the price of the ith item in a shop.

There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.

Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.
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
