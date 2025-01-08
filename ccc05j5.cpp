// First attempt 2025/01/06
// Continued 2025/01/07
// Problems: BBANANASS, BBBBASSSS (multiple pairs of B and S, since currently it relies on index of first S...)
#include <bits/stdc++.h>
using namespace std;

bool is_monkey(string word){
    if(word=="A") return true;
    if(word[0]=='A'){
        if(word[1]=='N'){
            if(word.length()==2) return false;
            return is_monkey(word.substr(2));
        }
    }
    else if(word[0]=='N'){
        return is_monkey(word.substr(1));
    }
    else if(word[0]=='B'){
        if(int(word.find('S'))!=-1){
            bool y = is_monkey(word.substr(1, word.find('S')-1));
            if(y && word.find('S')!=word.length()-1){ // here
                return is_monkey(word.substr(word.find('S')+1));
            }
            else if(!y){
                return false;
            }
            else if(word.find('S')==word.length()-1){
                return true;
            }
        }
        else return false;
    }
    return false;
}

int main(){
    while(true){
        string word;
        cin >> word;
        if(word=="X") break;
        if(is_monkey(word)) printf("YES\n");
        else printf("NO\n");
    }
    return 0;
}