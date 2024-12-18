// AC 2024/12/17
#include <bits/stdc++.h>
using namespace std;

int main(){
    string essay;
    getline(cin, essay);
    int cnt_l=0, cnt_u=0;
    string essay_l="", essay_u="";
    for(char x : essay){
        if(isupper(x)){
            cnt_u++;
            essay_u+=x;
            essay_l+=char(x+32);
        }
        else if(islower(x)){
            cnt_l++;
            essay_l+=x;
            essay_u+=char(x-32);
        }
        else{
            essay_l+=x;
            essay_u+=x;
        }
    }
    if(cnt_l>cnt_u) cout << essay_l << endl;
    else if(cnt_u>cnt_l) cout << essay_u << endl;
    else cout << essay << endl;
    return 0;
}