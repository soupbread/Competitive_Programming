// AC 2025/01/24
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, powah = 0;
    cin >> n;
    while(pow(2, powah)<n){
        powah++;
    }
    cout << powah << endl;
    return 0;
}