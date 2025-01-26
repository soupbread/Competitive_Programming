// AC 2025/01/25
#include <bits/stdc++.h>
using namespace std;

int main(){
    string m;
    cin >> m;
    for(int c='a'; c<='z'; c++){
        if(find(m.begin(), m.end(), c)==m.end()){
            cout << char(c) << endl;
            break;
        }
    }
}