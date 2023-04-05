// link to the question --> https://practice.geeksforgeeks.org/problems/palindrome0746/1

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int k = n;
        int ans = 0;
        int unit = 0;
        while(n!=0){
            unit = n%10;
            ans = ans*10 + unit;
            n = n/10;
        }
        if(ans == k){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}