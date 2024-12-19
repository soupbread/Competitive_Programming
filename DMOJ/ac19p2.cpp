// AC 2024/12/18
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, l;
    string s, news="";
    cin >> n >> l;
    if(l<0) l=abs(l)%26*-1;
    else l=abs(l)%26;
    cin.ignore();
    getline(cin, s);
    for(char x : s){
        if(!islower(x) && !isupper(x)){
            news+=x;
        }
        else{
            if(!islower(x+l) && !isupper(x+l)){
                if(x+l<65) news+=char(x+l+26);
                else if(x+l>90 && x+l<97 && islower(x)) news+=char(x+l-26);
                else if(x+l>90 && x+l<97 && isupper(x)) news+=char(x+l+26);
                else if(x+l>122) news+=char(x+l-26);
            }
            else news+=char(x+l);
        }
    }
    cout << news << endl;
    return 0;
}