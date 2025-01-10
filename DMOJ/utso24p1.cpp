// First attempt 2025/01/05
// AC 2025/01/09
#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n, k, cnt=0;
    cin >> n >> k;
    for(int i=n; i>0; i-=k){
        cnt+=i*2;
    }
    cout << cnt << endl;
    return 0;
}