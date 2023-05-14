// link to the question --> https://practice.geeksforgeeks.org/problems/palindrome-string0817/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=palindrome-string

class Solution {
    int isPalindrome(String S) {
        // code here
        int end = S.length() -1;
        for(int i = 0; i <= end; i++){
            if(S.charAt(i) != S.charAt(end)){
                return 0;
            }
            else{
                end--;
            }
        }
        return 1;
    }
};