// AyyyyyC 2025/02/13
// BFS
#include <bits/stdc++.h>
using namespace std;

int visited[2001];

int main(){
    int n, m, a, b;
    cin >> n >> m >> a >> b;
    vector<vector<int>> adj(n+1);
    visited[a] = 1;
    queue<int> q;
    q.emplace(a);
    for(int i=0; i<m; i++){
        int x, y;
        cin >> x >> y;
        adj[x].push_back(y);
        adj[y].push_back(x);
    }
    while(!q.empty()){
        int node = q.front();
        q.pop();
        if(node==b){
            cout << "GO SHAHIR!" << endl;
            return 0;
        }
        for(int no : adj[node]){
            if(!visited[no]){
                visited[no] = 1;
                q.emplace(no);
            }
        }
    }
    cout << "NO SHAHIR!" << endl;
    return 0;
}