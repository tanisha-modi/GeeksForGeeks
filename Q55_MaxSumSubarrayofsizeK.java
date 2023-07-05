class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long sum = 0L;
        long max = Arr.get(0);
        
        for(int i = 0; i < K; i++){
            sum += Arr.get(i);
            max = sum;
        }
        for(int i = K; i < N; i++){
            long temp = sum - Arr.get(i - K) + Arr.get(i);
            max = Long.max(max, temp);
            sum = temp;
        }
        return max;
    }
}