// AC 2025/01/26
#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n, n2;
    cin >> n >> n2;
    cout << max(n+n2, max(abs(n-n2), n*n2)) << endl;
    return 0;
}