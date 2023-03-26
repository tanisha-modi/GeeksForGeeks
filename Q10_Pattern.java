// link to the question -> https://practice.geeksforgeeks.org/problems/pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_9

class Solution {

    void printDiamond(int n) {
        // Your code here
         
        for(int i=1; i <= n; i++)
        {
            for(int j = 1; j <= 2*n; j++)
            {
                if(j <= n+i-1 && j > n-i )
                {
                   System.out.print("*");
                   j++;
                   System.out.print(" ");
                }
                else if(j < n-i +1){
                   System.out.print(" ");
                     
                }
            }
            
            System.out.println("");
        }
        for(int i=1; i <= n; i++)
        {
            for(int j = 1; j <= 2*(n) ; j++)
            {
                // System.out.print(" ");
                if(j < i){
                   System.out.print(" ");
                    
                }
                else if(j <= 2*(n)-i)
                {
                   System.out.print("*");
                   j++;
                   System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }
}
