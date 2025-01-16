// AC 2025/01/16
#include <bits/stdc++.h>
using namespace std;

int main(){
    string str;
    int ans = 1;
    getline(cin, str);
    for (char x : str){
        if(x == ' '){
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}