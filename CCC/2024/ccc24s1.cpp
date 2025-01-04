// AC 2025/01/03
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, cnt=0;
    cin >> n;
    int p[n*2];
    for(int i=0; i<n; i++){
        int h;
        cin >> h;
        p[i]=h, p[i+n]=h;
    }
    for(int i=0; i<n; i++){
        if(p[i+int(n/2)]==p[i]) cnt++;
    }
    cout << cnt << endl;
    return 0;
}