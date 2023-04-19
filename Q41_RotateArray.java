// link to the question --> https://practice.geeksforgeeks.org/problems/quick-left-rotation3806/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-left-rotation

class Solution
{
    void leftRotate(long arr[], int k,int n)
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
    public static void reverse(long[] arr, int start, int end){
         while(start<end){
             long temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
    }
}