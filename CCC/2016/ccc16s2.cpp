// AC 2024/12/05
#include <bits/stdc++.h>
using namespace std;

int main(){
    int q, n, ans=0;
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
        sort(p.begin(), p.end());
        for(int i=0; i<n; i++){
            ans+=max(d[i],p[i]);
        }
    }
    else{
        sort(d.begin(), d.end());
        sort(p.begin(), p.end(), greater<>());
        for(int i=0; i<n; i++){
            ans+=max(d[i],p[i]);
        }
    }
    cout << ans;
    return 0;
}