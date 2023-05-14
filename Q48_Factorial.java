// link to the question --> https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty[]=-1&page=1&query=problemTypefunctionaldifficulty[]-1page1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-factorial-numbers-less-than-or-equal-to-n

class Solution{
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> arr = new ArrayList<>();
        for(int i = 1; fact(i) <= N; i++){
           arr.add(fact(i));
        }
        return arr;
        
    }
    public static long fact(long N){
        if(N <= 1){
            return Long.valueOf(1);
        }
        return N*fact(N-1);
    }
}