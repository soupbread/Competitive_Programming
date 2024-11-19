// AC 2024/11/15

#include <bits/stdc++.h>

using namespace std;

int main(){
    int t, c, cnt=0, total=0, chores[c];
    cin >> t >> c;
    for(int i=0;i<c;i++){
        cin >> chores[i];
    }
    sort(chores, chores+c);
    for(int i=0;i<c;i++){
        total+=chores[i];
        if(total>t) break;
        cnt++;
    }
    cout << cnt;
}