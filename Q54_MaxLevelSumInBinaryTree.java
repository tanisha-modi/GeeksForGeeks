// link to the question --> https://practice.geeksforgeeks.org/problems/max-level-sum-in-binary-tree/1

class Solution {
    public int maxLevelSum(Node root) {
        // add code here.
        Queue<Node> q = new LinkedList();
        q.add(root);
        int maxSum = root.data;
        int ans = 1;
        int level = 1;

        while(!q.isEmpty()){
            int levelSize = q.size();
            int levelSum = 0;

            for(int i = 0; i < levelSize; i++){
                Node removed = q.remove();
                levelSum += removed.data;
                if(removed.left!=null){
                    q.add(removed.left);
                }
                if(removed.right!=null){
                    q.add(removed.right);
                }
            }
            if(levelSum > maxSum){
                maxSum = levelSum;
                ans = level;
            }
            level++;
        }
        return maxSum;
    }
}