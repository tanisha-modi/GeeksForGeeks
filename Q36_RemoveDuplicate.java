// link to the question --> https://practice.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicate-elements-from-sorted-array

class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int array[] = new int[N];
        array[0] = A[0];
        int count = 1;
        // int count = 1;
        for(int i = 1; i< N; i++ ){
            if(A[i-1] != A[i]){
                array[count] = A[i];
                count++;
            }
        }
        // System.out.print(count + "hello" + A[count - 1]);
        for(int k = 0; k < N; k++){
            A[k] = array[k];
        }
    return count;   
    }
}