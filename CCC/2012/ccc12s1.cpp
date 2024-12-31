// AC 2024/12/30
#include <bits/stdc++.h>
using namespace std;

int main(){
    int j, ans=0;
    cin >> j;
    if(j>=4) ans+=(j-3)*(j-2)*(j-1)/6;
    cout << ans << endl;
    return 0;
}