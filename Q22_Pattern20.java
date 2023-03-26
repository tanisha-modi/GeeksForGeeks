// link to the question --> https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662287416/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_20

class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1; i <= n; i++)
        {
            for(int j = 1; j <= 2*(n) ; j++)
            {
                if(j <= i){
                   System.out.print("*");
                    
                }
                else if(j > n*2-i)
                {
                   System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
         for(int i=2; i <= n; i++)
        {
            for(int j = 1; j <= 2*n; j++)
            {
                if(j <= n-i+1 || j > n+i-1 )
                {
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