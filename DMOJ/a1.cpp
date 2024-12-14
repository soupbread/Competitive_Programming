// AC 2024/12/13
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    cin.ignore();
    for(int i=1; i<=n; i++){
        int v;
        string word;
        cin >> v;
        cin.ignore();
        getline(cin, word);
        cout << i << " ";
        cout << word.substr(0, v-1);
        if(v<word.length()){
            cout << word.substr(v);
        }
        cout << endl;
    }
    return 0;
}