// link to the question --> https://practice.geeksforgeeks.org/problems/triangle-pattern-1661493231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_8

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1; i <= n; i++)
        {
            for(int j = 1; j <= 2*n+1 ; j++)
            {
                if(j < i){
                   System.out.print(" ");
                    
                }
                else if(j <= 2*n-i)
                {
                   System.out.print("*");
                }
            }
            
            System.out.println("");
        }
    }
}