// AC 2025/02/16!
#include <bits/stdc++.h>
using namespace std;

int visited[101], d[101];

int main(){
    int n;
    cin >> n;
    if(n==1){
        cout << 0 << endl;
        return 0;
    }
    vector<vector<int>> adj(n+1);
    queue<int> q;
    q.emplace(1);
    visited[1] = 1, d[1]=0;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            int x;
            cin >> x;
            if(x!=0){
                adj[i].push_back(j);
            }
        }
    }
    while(!q.empty()){
        int node = q.front();
        q.pop();
        for(int a : adj[node]){
            if(!visited[a]){
                q.emplace(a);
                visited[a] = 1;
                d[a]=d[node]+1;
            }
            if(a==n){
                cout << d[a] << endl;
                return 0;
            }
        }
    }
    return 0;
}