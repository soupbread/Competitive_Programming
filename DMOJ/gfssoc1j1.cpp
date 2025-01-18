// AC 2025/01/17
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, m, cnt=0;
    cin >> n >> m;
    for(int i=0; i<m; i++){
        int h;
        cin >> h;
        if(h>=n) cnt++;
    }
    cout << cnt << endl;
    return 0;
}