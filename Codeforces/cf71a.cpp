// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    int n;
    char word[101];
    scanf("%i",&n);
    for(int i=0;i<n;i++){
        scanf("%s",&word);
        if(strlen(word)>10){
            printf("%c%i%c\n",word[0],strlen(word)-2,word[strlen(word)-1]);
        }
        else{
            printf("%s\n",word);
        }
    }
}