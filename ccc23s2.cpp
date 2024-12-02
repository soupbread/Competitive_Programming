// Initial attempt 2024/11/30
// add psa
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> mountains(n);
    for(int i=0; i<n; i++){
        cin >> mountains[i];
    }
    cout << 0 << " ";
    for(int i=2; i<=n; i++){
        int l = 0, r = l+i-1, mini=INT_MAX, total=0;
        // cout << "lr " << l << " " << r << endl;
        while(r<n){
            total = 0;
            for(int j=0; j<=(r-l)/2; j++){
                total+=abs(mountains[l+j]-mountains[r-j]);
            }
            mini = min(total, mini);
            l++, r++;
            // cout << "lr " << l << " " << r << endl;
        }
        if(i<n) cout << mini << " ";
        else cout << mini;
    }
}