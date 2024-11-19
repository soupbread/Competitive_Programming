// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    freopen("cowsignal.in","r",stdin);
    freopen("cowsignal.out","w",stdout);

    int m,n,k;
    scanf("%i %i %i",&m,&n,&k);
    for(int i=0;i<m;i++){
        string inp,ans;
        cin >> inp;
        for(int j=0;j<n;j++){
            for(int x=0;x<k;x++){
                ans+=inp[j];
            }
        }
        for(int j=0;j<k;j++){
            cout << ans << "\n";
        }
    }
}