// link to the question --> https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1

class Solution {
    static String armstrongNumber(int n){
        // code here
        int x = n;
        int k = 0;
        while(n > 0){
            k = k + (n%10)*(n%10)*(n%10);
            n /= 10;
        }
        if(x == k)
        return "Yes";
        else
        return "No";
    }
}