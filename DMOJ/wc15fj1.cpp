// AC 2025/02/05
#include <bits/stdc++.h>
using namespace std;

int main(){
    string word;
    vector<char> charr;
    getline(cin, word);
    for(char x : word){
        charr.push_back(x);
    }
    for(int i=0; i<charr.size()-1; i++){
        cout << charr[i] << " ";
    }
    cout << charr[charr.size()-1] << endl;
    for(int i=1; i<charr.size(); i++){
        cout << charr[i] << endl;
    }
    return 0;
}