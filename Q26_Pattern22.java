// link to the question --> https://practice.geeksforgeeks.org/problems/square-pattern-1662666141/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_22
   
   class Solution {

        void printSquare(int n) {
            // code here
            for(int i=0;i<2*n-1;i++){
             
             // inner loop for no. of columns.
             for(int j=0;j<2*n-1;j++){
                 
                 // Initialising the top, down, left and right indices of a cell.
                 int top = i;
                 int bottom = j;
                 int right = (2*n - 2) - j;
                 int left = (2*n - 2) - i;
                 
                 // Min of 4 directions and then we subtract from n
                 // because previously we would get a pattern whose border
                 // has 0's, but we want with border N's and then decrease inside.
                 System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
             }
             
             // As soon as the numbers for each iteration are printed, we move to the
             // next row and give a line break otherwise all numbers
             // would get printed in 1 line.
             System.out.println();
         }
        }
    }

