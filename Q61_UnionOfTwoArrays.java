// link to the question -> https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> set = new HashSet<>();
        //Your code here
        for(int i = 0; i < n; i++){
            set.add(a[i]);
        }
        for(int i = 0; i < m; i++){
            set.add(b[i]);
        }
        return set.size();
    }
}