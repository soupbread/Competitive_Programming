// AC 2024/12/29
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, cnt=0;
    cin >> n;
    for(int i=0; i<=n/4; i++){
        if((n-(i*4))%5==0) cnt++;
    }
    cout << cnt << endl;
    return 0;
}