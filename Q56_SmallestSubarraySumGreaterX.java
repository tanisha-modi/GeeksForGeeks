// link to the question --> https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1

class Solution {

    public static int smallestSubWithSum(int nums[], int n, int target) {
        // Your code goes here
         int i = 0, k = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while(k < n){
            sum += nums[k];
            while(sum > target){
                ans = Math.min(ans, k-i +1);
                sum -= nums[i];
                i++;
            }
            k++;
        }
        if(ans == Integer.MAX_VALUE)
        return 0;
        return ans;
    }
}

