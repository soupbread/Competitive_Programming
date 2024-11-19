// AC 2024/11/17

#include <bits/stdc++.h>

using namespace std;

int main(){
    int d, s;
    cin >> d >> s;
    while(s<d){
        d+=s;
        cin >> s;
    }
    cout << d;
}