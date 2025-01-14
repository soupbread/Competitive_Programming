// AC 2025/01/13
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    for(int i=0; i<n; i++){
        int a, b;
        cin >> a >> b;
        if(a%100==17 || b%100==17){
            cout << "NO" << endl;
        }
        else if(a%10==7 && b%100==11){
            cout << "YES" << endl;
        }
        else if(a%100==11 && b%10==7){
            cout << "YES" << endl;
        }
        else cout << "NO" << endl;
    }
    return 0;
}