// link to the question --> https://practice.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort

class Solution
{
	int  select(int arr[], int end)
	{
         int max = 0;
         for(int j = 0; j <= end; j++){
             if(arr[max] < arr[j]){
                 max = j;
             }
         }
         return max;
	}
	
	void selectionSort(int arr[], int n)
	{
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = select(arr, last);
            
            int temp =  arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
	}
}