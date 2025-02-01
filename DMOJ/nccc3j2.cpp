// AC 2025/01/31
#include <bits/stdc++.h>
using namespace std;

int main(){
    string word;
    bool can = false;
    cin >> word;
    for(int i=1; i<=word.length()-1; i++){
        string sub1 = word.substr(0, i), r1 = sub1;
        reverse(r1.begin(), r1.end());
        string sub2 = word.substr(i, word.length()-i), r2 = sub2;
        reverse(r2.begin(), r2.end());
        if(sub1 == r1 && sub2 == r2){
            cout << "YES" << endl;
            can = true;
            break;
        }
    }
    if(!can) cout << "NO" << endl;
    return 0;
}