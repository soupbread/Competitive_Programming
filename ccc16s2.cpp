#include <bits/stdc++.h>
using namespace std;

int main(){
    int q, n, ans;
    cin >> q >> n;
    vector<int> d(n), p(n);
    for(int i=0; i<n; i++){
        cin >> d[i];
    }
    for(int i=0; i<n; i++){
        cin >> p[i];
    }
    if(q==1){
        sort(d.begin(), d.end());
        sort(p.begin(), d.end());
        for(int i=0; i<n; i++){
            ans+=max(d[i],p[i]);
        }
    }
    else{
        sort(d.begin(), d.end());
        sort(p.end(), d.begin());
        for(int i=n-1; i>=0; i++){
            ans+=max(d[i],p[i]);
        }
    }
    cout << ans;
    return 0;
}