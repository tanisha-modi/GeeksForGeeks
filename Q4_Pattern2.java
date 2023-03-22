// link for the question --> https://practice.geeksforgeeks.org/problems/right-triangle/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_2

class Solution {

    void printTriangle(int n) {
        // code here
        
        for(int i=0; i < n; i++){
            for(int j=0; j <= i; j++){
            System.out.print("* ");
            }
            
            System.out.println("");
        }
    }
}