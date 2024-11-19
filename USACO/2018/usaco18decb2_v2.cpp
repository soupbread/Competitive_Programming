// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    freopen("blist.in","r",stdin);
    freopen("blist.out","w",stdout);
    int n, s, t, b[101] {0};
    int starts[1001] {0}, finishes[1001] {0}, curr_b=0, ans=0;
    cin >> n;
    for(int i=1;i<=n;i++){
        cin >> s >> t >> b[i];
        starts[s]=i;
        finishes[t]=i;
    }
    for(int i=0;i<1001;i++){
        if(starts[i]){
            curr_b+=b[starts[i]];
            ans=max(curr_b,ans);
        }
        else if(finishes[i]){
            curr_b-=b[finishes[i]];
            ans=max(curr_b,ans);
        }
    }
    cout << ans;
}