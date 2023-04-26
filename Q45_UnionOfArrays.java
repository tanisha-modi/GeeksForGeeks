// link to the ques --> https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        
        HashMap <Integer,Integer > freq=new HashMap<>();
        
        ArrayList<Integer> Union=new ArrayList<>();
        
        for (int i = 0; i < n; i++)
        freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
    
        for (int i = 0; i < m; i++)
         freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        
        for (int it: freq.keySet())
        Union.add(it);
        
        Collections.sort(Union);
        return Union;

         
        //  HashSet<Integer> set = new HashSet<>();
         
        //  for(int i = 0; i < n; i++){
        //      set.add(arr1[i]);
        //  }
        //  for(int i = 0; i < m; i++){
        //      set.add(arr2[i]);
        //  }
         
        //  ArrayList<Integer> arr = new ArrayList<Integer>();
        //  int i = 0;
         
        //  for(int value : set){
        //      arr.add(value);
        //  }
         
        //  return arr;
}}
