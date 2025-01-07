// First attempt 2025/01/06
#include <bits/stdc++.h>
using namespace std;

int main(){
    while(true){
        string word;
        bool mword = true;
        cin >> word;
        if(word=="X") break;
        if(word=="A"){
            printf("YES\n");
            continue;
        }
        else if(word.length()==1 && word!="A"){
            mword = false;
            printf("NO\n");
            continue;
        }
        else{
            char prev='N';
            for(long unsigned int i=0; i<word.length(); i++){
                if(i==0 && word[0]=='B'){
                    if(word[word.length()-1]!='S'){
                        mword = false;
                        printf("NO\n");
                        break;
                    }
                }
                else if(word[i]=='B'){
                    if(word[i-1]!='N' && word[i-1]!='S'){
                        mword = false;
                        printf("NO\n");
                    }
                }
                else{
                    if(word[i]!='S' && ((prev=='N' && word[i]!='A') || (prev=='A' && word[i]!='N'))){
                        mword = false;
                        printf("NO\n");
                        break;
                    }
                    if(prev=='N') prev = 'A';
                    else prev = 'N';
                }
            }
            if(mword) printf("YES\n");
        }
    }
    return 0;
}