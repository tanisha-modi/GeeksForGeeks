// link to the question --> https://practice.geeksforgeeks.org/problems/merge-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=merge-sort

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int[] mix = new int[r - l +1];
         int i = l;
         int j = m+1;
         int k = 0;
         
         while(i <= m && j <= r){
             if(arr[i] <= arr[j]){
                 mix[k] = arr[i];
                 i++;
             }
             else{
                 mix[k] = arr[j];
                 j++;
             }
             k++;
         }
         
         while(i <= m){
             mix[k] = arr[i];
             i++;
             k++;
         }
         while(j <= r){
             mix[k] = arr[j];
             j++;
             k++;
         }
         
         for(int z = 0; z < mix.length; z++){
             arr[l + z] = mix[z];
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l >= r){
            return;
        }
        
        int mid = (r+l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        
        merge(arr, l, mid, r);
    }
}