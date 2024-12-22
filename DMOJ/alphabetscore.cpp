// Theoretical AC 2024/12/21
#include <bits/stdc++.h>
using namespace std;

int main(){
    string word;
    cin >> word;
    unordered_map<char, int> m;
    int ans = 0;
    for(int i=0; i<word.length(); i++){
        if(m[word[i]]) m[word[i]]++;
        else m[word[i]]=1;
    }
    for(auto& p : m) ans+=(p.first - 'a' + 1)*p.second;
    cout << ans << endl;
    return 0;
}