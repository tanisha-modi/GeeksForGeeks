// link to the question --> https://practice.geeksforgeeks.org/problems/count-digits5716/1

class Solution{
    static int evenlyDivides(int N){
        // code here
        int d;
        int count = 0;
        while(N != 0){
            d = N%10;
            if(N%d ==0){
                count++;
            }
             N = N/10;
        }
        return count;
    }
}