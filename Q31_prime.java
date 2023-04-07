
// link to the question --> https://practice.geeksforgeeks.org/problems/for-loop-primecheck-java/0

class Geeks {
    static void isPrime(int n) {
        boolean flag = false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Your code here
            if(n%i ==0){
                System.out.println("No");
                flag = true;
                return;
            }
            
        }
        if(n == 1){
             System.out.println("No");
             return;
        }
        if(!flag){
            System.out.println("Yes");
            return;
        }
} 
}