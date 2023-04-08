// link to the question --> https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array

class Compute {
    
    public int largest(int arr[], int n)
    {
        int a = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(a < arr[i]){
                a = arr[i];
            }
        }
        return a;
    }
}