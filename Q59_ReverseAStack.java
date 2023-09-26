// link to the question --> https://practice.geeksforgeeks.org/problems/reverse-a-stack/1

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        s = insertAtBottom(s, top);
    }
    public static Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {
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