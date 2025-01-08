// wat
#include <bits/stdc++.h>
using namespace std;

int main(){
    int h1, w1, h2, w2, cnt1=1, cnt2=1, s=1;
    cin >> h1 >> w1 >> h2 >> w2;
    while(true){
        if(s%w1==0) cnt1++;
        if(s%w2==0) cnt2++;
        if(cnt1>=h2 && cnt2>=h1){
            cout << -1 << endl;
            break;
        }
        else if(cnt1>=h2){
            cout << 1 << endl;
            break;
        }
        else if(cnt2>=h1){
            cout << 2 << endl;
            break;
        }
        s++;
    }
    return 0;
}