// link to the ques --> https://practice.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=move-all-zeroes-to-end-of-array

class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        if(arr.length > 1){
        int nz = 0; //non-zero
        int z = 0; //zero
        while(nz<arr.length){
            if(arr[nz] != 0){
                swap(arr,z,nz);
                nz++;
                z++;
            }
            else{
            nz++;
            }
        }
    }
    }
    public static void swap(int[] arr,int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}