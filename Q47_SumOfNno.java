// link to the question --> https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sum-of-first-n-terms

class Solution {
    
    long sumOfSeries(long N) {
        // code here
      if(N < 1){
          return 0;
      }  
      return N*N*N + sumOfSeries(N-1);
        
    }
}