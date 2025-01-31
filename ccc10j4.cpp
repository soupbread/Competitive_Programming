#include <bits/stdc++.h>
using namespace std;

int main(){
    while(true){
        int n;
        cin >> n;
        if(n==0) break;

        vector<int> temps(n), diffs(n);
        for(int i=0; i<n; i++){
            cin >> temps[i];
        }
        for(int i=1; i<n; i++){
            diffs[i] = temps[i] - temps[i-1];
        }
        
    }
    return 0;
}
// KMP Algorithm