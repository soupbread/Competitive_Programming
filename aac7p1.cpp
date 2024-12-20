// AC 2024/12/19
#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    for(int i=0; i<t; i++){
        int w, h;
        cin >> w >> h;
        if(w<4 && h<4) cout << "bad" << endl;
        else if(w==1 || h==1 && w<7) cout << "bad" << endl;
        else cout << "good" << endl;
    }
}