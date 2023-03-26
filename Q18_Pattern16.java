// link to the question --> https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285334/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_16

class Solution {

    void printTriangle(int n) {
        // code here
        char A = 65;
        for(int i=1; i <= n; i++){
            for(int j=1; j <= i; j++){
            System.out.print(A);
            }
            
            System.out.println("");
            A++;
        }
    }
}