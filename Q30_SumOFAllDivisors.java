// link to the question --> https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
// explanation --> https://www.geeksforgeeks.org/sum-divisors-1-n/

// time complexity --> O(n)
class Solution{
    static long sumOfDivisors(int N){
        // code here
        long sum = Long.valueOf(0);
        for(int j = 1; j<=N; j++){
            sum += (N/j)*j;
        }
        return sum;
    }
}


// time complexity --> O(n^2)

// class Solution{
//     static long sumOfDivisors(int N){
//         // code here
//         long sum;
//         long ans =0;
//         for(int j = 1; j<=N; j++){
//             sum = Long.valueOf(0);
//             for( int i = 1; i <= j; i++){
//                 if(j%i == 0){
//                 sum += Long.valueOf(i);
//                 }
//             }
//             ans += sum;
//         }
//         return ans;
//     }
// }