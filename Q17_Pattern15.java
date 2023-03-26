// link to the question --> https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285196/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_15

class Solution {

    void printTriangle(int n) {
        // code here
        char A;
        for(int i=1; i <= n; i++){
            A = 65;
            for(int j=1; j <= n-i+1; j++){
            System.out.print(A++);
            }
            
            System.out.println("");
        }
    }
}