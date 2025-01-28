// ...?
#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n, b, s, g, ans = 0;
    cin >> n >> b >> s >> g;
    long long curr = b + s*3 + g*5;
    if(n - curr > 0){
        ans = ceil((n-curr+4)/5);
    }
    cout << ans << endl;
}