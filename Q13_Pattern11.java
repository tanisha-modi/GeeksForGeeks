// link to the question -> https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718455/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_11

class Solution {

    void printTriangle(int n) {
        // code here
        int x = 1;
        for(int i=0; i < n; i++){
            for(int j=0; j <= i; j++){
             if((i+j)%2 == 1){
                 System.out.print(0 + " ");
                 
             }else{
                 System.out.print(1 + " ");
                 
             }
            }
            
            System.out.println("");
        }
    }
}