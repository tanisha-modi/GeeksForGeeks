// link to the question --> https://practice.geeksforgeeks.org/problems/missing-number4257/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=missing-number

class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        int ans = 0;
         // Your code goes here
         int arr[] = new int[N+1];
         for(int i = 0; i < arr.length; i++){
             arr[i] = i+1;
         }
         for(int i= 0; i < A.length; i++){
             for(int j = 1; j <= N; j++){
                 if(A[i]==j){
                     arr[j] = 1;
                 }
             }
         }
         for(int i= 0; i < arr.length; i++){
             if(arr[i] != 1){
                 ans = i;
             }
         }
         return ans;
    }
}