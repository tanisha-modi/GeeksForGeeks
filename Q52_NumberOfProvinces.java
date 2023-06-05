// link to the question --> https://practice.geeksforgeeks.org/problems/number-of-provinces/1 

class Solution {
    public:
    void bfs(vector<vector<int>> adj, int v, vector<int> &vis, int node)
    {
        queue<int> qu;
        qu.push(node);
        vis[node] = 1;
        while(!qu.empty())
        {
            int topnode = qu.front();
            qu.pop();
            for(int i=0;i<v;++i)
            {
                if(adj[topnode][i] == 1)
                {
                    if(vis[i] == 0)
                    {
                        qu.push(i);
                        vis[i] = 1;
                    }
                }
            }
        }
    }
    int numProvinces(vector<vector<int>> adj, int V) {
        int ans = 0 ;
        vector<int> vis(V);
        for(int i=0;i<V;++i)
        {
            if(!vis[i])
            {
                ans++;
                bfs(adj, V, vis, i);
            }
        }
        
        return ans;
    }
};