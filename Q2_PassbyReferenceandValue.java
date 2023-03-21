// link for the question -> https://practice.geeksforgeeks.org/problems/pass-by-reference-and-value/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pass-by-reference-and-value

// User function Template for Java

class Solution {
    static int[] passedBy(int a, int b) {
        // code here
        int[] ans = new int[2];
        ans[0] = a+1;
        ans[1] = b + 2;
        return ans;
    }
}
