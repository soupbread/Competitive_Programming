// AC 2025/01/27
#include <bits/stdc++.h>
using namespace std;

int main(){
    string word, res="";
    getline(cin, word);
    res = string(1, word[0]) + char(tolower(word[1]));
    for(int i=2; i<word.length(); i++){
        if(word[i-2]=='.'){
            res+=string(1, word[i]);
        }
        else if(word[i]=='I' && word[i-1]==' ' && i!=word.length()-1 && (word[i+1]==' ' || word[i+1]=='.')){
            res+=string(1, word[i]);
        }
        else res+=tolower(word[i]);
    }
    cout << res << endl;
    return 0;
}