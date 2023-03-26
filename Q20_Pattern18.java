// link to the question --> https://practice.geeksforgeeks.org/problems/triangle-pattern-1662286302/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_18

class Solution {

    void printTriangle(int n) {
        // code here
        char A;
        for(int i=1; i <= n; i++){
            A = 65;
            A = (char)(n + A - 1);
            for(int j=1; j <= i; j++){
            System.out.print(A-- + " " );
            }
            
            System.out.println("");
        }
    }
}