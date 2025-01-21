#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int cnt = n;
    vector<int> o, ne;
    for(int i=0; i<n; i++){
        int s;
        cin >> s;
        o.push_back(s);
    }
    for(int i=0; i<n; i++){
        int t;
        cin >> t;
        ne.push_back(t);
    }
    for(int i=0; i<n; i++){
        if(i < n-1 && o[i] + 1 == o[i+1]){
            cnt--;
        }
    }
    if(cnt<=0) cnt = 1;
    cout << cnt << endl;
    return 0;
}