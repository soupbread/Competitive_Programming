// AC 2025/01/06
#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n, t=0;
    cin >> n;
    for(int i=0; i<n; i++){
        long long a;
        cin >> a;
        t+=a;
    }
    cout << t%998244353 << endl;
    return 0;
}