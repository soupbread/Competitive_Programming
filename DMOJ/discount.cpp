// AC 2025/02/02
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, t, cnt = 0;
    cin >> n >> t;
    for(int i=0; i<n; i++){
        double c, d;
        cin >> c >> d;
        if(c*(100-d)/100<=t){
            cnt++;
        }
    }
    cout << cnt << endl;
    return 0;
}