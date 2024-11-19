#include <bits/stdc++.h>

using namespace std;

int visited[2001];

int main(){
    int n, m, a, b;
    cin >> n >> m >> a >> b;
    vector<vector<int>> adj(n+1);
    visited[a]=1;
    for(int i=0;i<m;i++){
        int x,y;
        cin >> x >> y;
        adj[y].push_back(x);
        adj[x].push_back(y);
    }

    queue<int> q;
    q.emplace(a);
    while(!q.empty()){
        int f=q.front();
        if(f==b){
            cout << "GO SHAHIR!\n";
            return 0;
        }
        q.pop();
        for(int i=0;i<adj[f].size();i++){
           if(!visited[adj[f][i]]){
            visited[adj[f][i]]=1;
            q.emplace(adj[f][i]);
           }
        }
    }
    cout << "NO SHAHIR!\n";
}
