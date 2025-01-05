// AC 2025/01/04
#include <bits/stdc++.h>
using namespace std;

int main(){
    string word;
    char c[] = {'e', 'i', 'o', 'u'};
    cin >> word;
    for(char x : word){
        if(x!=97 && x!=101 && x!=105 && x!=111 && x!=117){
            char close='a';
            cout << x;
            for(char y : c){
                if(abs(y-x)<abs(close-x)) close = y;
            }
            cout << close;
            if(x!='z') x++;
            while(x!='z' && (x==97 || x==101 || x==105 || x==111 || x==117)) x++;
            cout << x;
        }
        else cout << x;
    }
    cout << endl;
    return 0;
}
