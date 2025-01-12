// AC 2025/01/11
#include <bits/stdc++.h>
using namespace std;

int main(){
    string word, new_word = "", c = "CAMBRIDGE";
    cin >> word;
    for(char x : word){
        if(c.find(x) == -1){
            new_word += x;
        }
    }
    cout << new_word << endl;
    return 0;
}