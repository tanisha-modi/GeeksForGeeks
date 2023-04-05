// link to the question --> https://practice.geeksforgeeks.org/problems/reverse-bits3556/1

class Solution {
    static Long reversedBits(Long X) {
        // code here
            char n;
            String ans = new String();
        String a = Long.toBinaryString(X);
        // System.out.println(a);
        String padding = String.format("%32s", a).replace(' ', '0');
        // System.out.println(padding);
        // System.out.println(padding.getClass().getSimpleName());

        // String padding = String.format("%32s",X).replace(' ','0');
         for (int i = padding.length(); i > 0 ; i--) {
            n = padding.charAt(i-1);
            ans = ans + n;
        }
        // System.out.println(ans);
        Long result = Long.parseLong(ans, 2);
        return result;
    }
    public static void main(String[] args) {
    System.out.println(reversedBits((long)1));
        
}
}