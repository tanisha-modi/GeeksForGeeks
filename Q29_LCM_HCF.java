// link to the question --> https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1

// link to the most optimal solution video  --> https://www.youtube.com/watch?v=B1gbmQF4o80


// time complexity --> O(log(n))
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        
        
         Long ans[] = new Long[2];
         
         Long c;
         Long P = A;
         Long Q = B;
         do {
        c = A % B;
        if (c > 0) {
            A = B;
            B = c;
            ans[1] = c;
            ans[0] = (P*Q)/ans[1];
            
        }
    } while (c != 0);
    if(P == 1 && Q == 1){
                ans[0] = P;
                ans[1] = P;
            }
    return ans;
    }
}

// time complexity --> O(n)
// class Solution {
//     static Long[] lcmAndGcd(Long A , Long B) {
//         // code here
        
        
//          Long ans[] = new Long[2];
         
         
//          // HCF
//          Long min;
//          Long max;
//          if( A < B){
//              min = A;
//              max = B;
//          }
//          else{
//              min = B;
//              max = A;
//          }
//          int j = 1;
//         for(Long l = Long.valueOf(j) ; l <= min; l++){
//             if( A%l == 0 && B%l == 0 ){
//                 ans[1] = l;
//                 ans[0] = (A*B)/l;
//             }
//         }
        
//         // // LCM 
//         // for(Long l = max; l <= Long.MAX_VALUE; l++ ){
//         //     if(l%A == 0 && l%B == 0){
//         //         ans[0] = l;
//         //         return ans;
//         //     }
//         // }
        
        
        
        
        return ans;
    }
};