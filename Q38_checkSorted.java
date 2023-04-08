// link to the question --> https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}