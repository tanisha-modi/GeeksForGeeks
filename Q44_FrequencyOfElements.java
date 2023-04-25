// link to the question --> https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        int[] arr1 = new int[P];
        for(int i = 0; i < N; i++){
            arr1[arr[i]-1]++;
        }
        
        for(int i = 0; i < N && i < P; i++){
            arr[i] = arr1[i];
        }
        if(P<N){
        for(int j = P; j < N; j++){
            arr[j] = 0;
        }
        }
    } 
}