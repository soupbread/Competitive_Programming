// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    freopen("breedflip.in","r",stdin);
    freopen("breedflip.out","w",stdout);
    int n,i=0,prev=-2,cnt=0;
    string a,b;
    cin >> n >> a >> b;
    for(int i=0;i<n;i++){
        if(a[i]!=b[i]){
            if(i!=prev+1){
                cnt++;
            }
            prev=i;
        }
    }
    cout << cnt;
}