// link to the question --> https://practice.geeksforgeeks.org/problems/triangle-number/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_3

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1; i <= n; i++){
            for(int j=1; j <= i; j++){
            System.out.print(j + " " );
            }
            
            System.out.println("");
        }
    }
}