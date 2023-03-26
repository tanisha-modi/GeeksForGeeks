// link to the question --> https://practice.geeksforgeeks.org/problems/square-pattern-1662287714/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_21

class Solution {

    void printSquare(int n) {
        // code here
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
               if(i == 0 || i ==n-1 || j == 0 || j == n-1){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
            
            System.out.println("");
        }
    }
}