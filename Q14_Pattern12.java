// link to the question --> https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662664259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_12

class Solution {

    void printTriangle(int n) {
        // code here 
        for(int i=1; i <= n; i++){
            for(int j=1; j <= n*2; j++){
                if(j <= i){
                    System.out.print(j + " " );
                }
                else if(j <= n*2-i){
                     System.out.print("  " );
                }
                else if(j > n*2-i){
                    System.out.print(n*2 - j+1+ " ");
                }
            }
            
            System.out.println("");
        }
    }
}