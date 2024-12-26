// AC 2024/12/25
#include <bits/stdc++.h>
using namespace std;

int main(){
    int k, m;
    vector<int> friends, new_friends;
    cin >> k >> m;
    for(int i=1; i<=k; i++) friends.push_back(i);
    for(int i=0; i<m; i++){
        new_friends.clear();
        int r;
        cin >> r;
        for(int j=0; j<friends.size(); j++){
            if((j+1)%r!=0) new_friends.push_back(friends[j]);
        }
        friends = new_friends;
    }
    for(int& fren : new_friends) cout << fren << endl;
    return 0;
}