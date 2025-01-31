// AC 2025/01/30
#include <bits/stdc++.h>
using namespace std;

int main(){
    int d;
    cin >> d;
    for(int i=0; i<d; i++){
        int t, total = 0;
        cin >> t;
        for(int j=0; j<t; j++){
            int m;
            cin >> m;
            total += m;
        }
        if(total==0) cout << "Weekend" << endl;
        else cout << "Day " << i+1 << ": " << total << endl;
    }
    return 0;
}