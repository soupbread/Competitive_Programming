// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    freopen("speeding.in","r",stdin);
    freopen("speeding.out","w",stdout);

    int n,m,ans,dis,sp,cur=0;
    int limit[100], bessie[100];
    scanf("%i %i",&n,&m);

    for(int i=0;i<n;i++){
        scanf("%i %i",&dis,&sp);
        for(int j=cur;j<dis+cur;j++){
            limit[j]=sp;
        }
        cur+=dis;
    }
    cur=0;
    for(int i=0;i<m;i++){
        scanf("%i %i",&dis,&sp);
        for(int j=cur;j<dis+cur;j++){
            bessie[j]=sp;
        }
        cur+=dis;
    }
    for(int i=0;i<100;i++){
        if(bessie[i]-limit[i]>ans){
            ans=bessie[i]-limit[i];
        }
    }
    printf("%i",ans);
    return 0;
}