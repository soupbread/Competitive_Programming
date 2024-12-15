// AC 2024/12/14
#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    for(int i=0; i<t; i++){
        int n, k;
        cin >> n >> k;
        int cnt=n/k;
        if(n%k!=0) cnt++;
        cout << cnt << endl;
    }
    return 0;
}