// link to the question --> https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_7

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1; i <= n; i++)
        {
            for(int j = 1; j <= 2*n; j++)
            {
                if(j <= n+i-1 && j > n-i  )
                {
                   System.out.print("*");
                }
                else if(j < n-i +1){
                   System.out.print(" ");
                    
                }
            }
            
            System.out.println("");
        }
    }
}