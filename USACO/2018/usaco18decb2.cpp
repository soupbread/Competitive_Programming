// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    freopen("blist.in","r",stdin);
    freopen("blist.out", "w", stdout);
    int buckets[1000] {0}, n, s, t, b, ans=0;
    scanf("%i",&n);
    for(int i=0;i<n;i++){
        scanf("%i %i %i",&s,&t,&b);
        for(int i=s;i<t+1;i++){
            buckets[i]+=b;
        }
    }
    for(int i=0;i<1000;i++){
        if(buckets[i]>ans) ans=buckets[i];
    }
    printf("%i",ans);
}