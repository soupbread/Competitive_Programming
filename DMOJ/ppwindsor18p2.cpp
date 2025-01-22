// AC 2025/01/21
#include <bits/stdc++.h>
using namespace std;

int main(){
    int w, h;
    cin >> w >> h;
    for(int i=0; i<h; i++){
        for(int j=0; j<w; j++){
            if(i%2==0 && j%2==0) cout << 0;
            else if(i%2==1 && j%2==1) cout << 0;
            else cout << 1;
        }
        cout << endl;
    }
    return 0;
}