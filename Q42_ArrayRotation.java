// link to the question --> https://practice.geeksforgeeks.org/problems/reversal-algorithm5340/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reversal-algorithm

class Solution
{
    void leftRotate(int arr[], int n,int k)
    {
         // what if k value greater than length of nums 
        k = k%arr.length;
        k = arr.length - k;
        // step 1 - full array reverse
        reverse(arr, 0, arr.length -1);

        // step 2 - reverse array till k -1
        reverse(arr, 0 , k-1);

        //step 3 - reserve array from k to nums.length
        reverse(arr, k, arr.length -1);
        
    }
    public static void reverse(int[] arr, int start, int end){
         while(start<end){
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
    }
}