// link to the question --> https://practice.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1

class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {
        if(St.isEmpty()){
            St.push(X);
            return St;
        }
        int k = St.pop();
        St = insertAtBottom(St, X);
        St.push(k);
        return St;
    }
}