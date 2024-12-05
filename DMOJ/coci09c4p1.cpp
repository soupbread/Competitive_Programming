// AC 2024/12/04
#include <bits/stdc++.h>
using namespace std;

int main(){
    string word;
    cin >> word;
    cout << word[0];
    for(int i=1; i<word.length(); i++){
        if(word[i]=='-'){
            cout << word[i+1];
        }
    }
    cout << endl;
    return 0;
}