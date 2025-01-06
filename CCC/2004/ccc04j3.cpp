
// AC 2025/01/05
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, m;
    cin >> n >> m;
    vector<string> adjs, nouns;
    for(int i=0; i<n; i++){
        string adj;
        cin >> adj;
        adjs.push_back(adj);
    }
    for(int i=0; i<m; i++){
        string noun;
        cin >> noun;
        nouns.push_back(noun);
    }
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            cout << adjs[i] << " as " << nouns[j] << endl;
        }
    }
    return 0;
}