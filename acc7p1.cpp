// AC 2024/11/25

#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    for(int i=0;i<t;i++){
        int n;
        cin >> n;
        if(n==2) cout << 2 << endl;
        else cout << n-1 << endl;
    }
}