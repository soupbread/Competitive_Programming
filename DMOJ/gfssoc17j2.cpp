// AC 2025/02/01
#include <bits/stdc++.h>
using namespace std;

int main(){
    int total = 0, req, aif;
    for(int i=0; i<6; i++){
        int g;
        cin >> g;
        total+=g;
    }
    cin >> aif;
    int avg = total/6 + aif;
    cin >> req;
    if(avg>=req) cout << "yes" << endl;
    else cout << "no" << endl;
    return 0;
}