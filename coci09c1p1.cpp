#include <bits/stdc++.h>
using namespace std;

int main(){
    int num[8];
    bool asc = false, des = false, mix = false;
    for(int i=0; i<8; i++){
        cin >> num[i];
    }
    for(int i=1; i<8; i++){
        if(num[i]>num[i-1] && mix==false){
            asc = true;
        }
        else if(num[i]<num[-1] && mix==false){
            des = true;
        }
        if(asc && des){
            mix = true;
            asc = false;
            des = false;
        }
    }
    if(mix) cout << "mixed" << endl;
    else if(des) cout << "descending" << endl;
    else cout << "ascending" << endl;
    return 0;
}