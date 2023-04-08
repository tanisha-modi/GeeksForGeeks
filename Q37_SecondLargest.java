// link to the question --> https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

class Solution {
    int print2largest(int arr[], int n) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for(int i= 0; i < arr.length; i++){
            if(a < arr[i]){
                b = a;
                a = arr[i];
            }
            else if(b < arr[i] && a > arr[i]){
                b = arr[i];
            }
        }
        if(b == Integer.MIN_VALUE){
            return -1;
        }
        return b;
    }
}