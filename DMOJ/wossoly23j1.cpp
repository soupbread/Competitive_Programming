// AC 2025/02/10
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, minn = INT_MAX;
    cin >> n;
    for(int i=0; i<n; i++){
        int price;
        cin >> price;
        minn = min(minn, price);
    }
    cout << minn << endl;
    return 0;
}