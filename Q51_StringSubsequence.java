// link to the question --> https://practice.geeksforgeeks.org/problems/string-subsequence-game5515/1

class Solution {
    static HashSet<String> set = new HashSet<>();
    static TreeSet<String> allPossibleSubsequences(String s) {
        
        subs(s, 0, "");  // function call
        
        TreeSet<String> tree_set = new TreeSet<String>(set);
        set.clear();
        return tree_set;
    }
    public static void subs(String s,int idx, String newString){
        
        if(idx == s.length()){
            
            // string length should be greater than 1 for further operations and
            // we only need unique solution 
            if(!set.contains(newString) && newString.length() > 1){
                char vow = newString.charAt(0); 
                char con = newString.charAt(newString.length() -1 );
                
                // check for consonant and vowel 
                if((vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u') && (con != 'a' && con != 'e' && con != 'i' && con != 'o' && con != 'u'))
                    set.add(newString);
                  }
            return;
        }
        
        char cur = s.charAt(idx);  // current char in String 
        
        // if the next char at idx is going to join
        subs(s, idx+1, newString + cur);
        
        // if the next char at idx is not going to join
        subs(s, idx+1, newString);
        return;
    }
}