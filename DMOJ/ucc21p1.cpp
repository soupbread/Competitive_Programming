// AC 2025/01/18
#include <bits/stdc++.h>
using namespace std;

int main(){
    string coins;
    int cnt = 0;
    cin >> coins;
    for(int i=0; i<coins.length(); i++){
        if(coins[i]=='2' && i<coins.length()-1){
            if(coins[i+1]!='5'){
                cnt++;
            }
        }
        if(i==coins.length()-1 && coins[i]=='2'){
            cnt++;
        }
    }
    cout << cnt << endl;
    return 0;
}