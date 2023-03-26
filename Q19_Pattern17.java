// link to the question --> https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285911/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_17

class Solution {

    void printTriangle(int n) {
        // code here
        char A;
         for(int i=1; i <= n; i++){
            A = 64;
            for(int j=1; j < n*2; j++){
               if(j < n-i+1){
                   System.out.print(" ");
                }
                else if(j <= n){
                    A++;
                    System.out.print(A);
                }
                else if(j > n && j < n*2-(n-i)){
                    System.out.print(--A);
                }
                
            }
            
            
            System.out.println("");
        }
    }
}