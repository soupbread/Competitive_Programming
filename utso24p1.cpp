// First attempt 2025/01/05
#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n, k, cnt=0;
    cin >> n >> k;
    if(k>=n){
        cnt=n*2;
    }
    else{
        for(int c=1; c<=int(n/k); c++){
            cnt+=k*c*2;
        }
        if(n%k!=0){
            cnt+=n*2;
        }
    }
    cout << cnt << endl;
    return 0;
}