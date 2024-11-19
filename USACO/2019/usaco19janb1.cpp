// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    freopen("shell.in","r",stdin);
    vector<int> shell_loc{0,1,2}, cnt{0,0,0};
    int n, a, b, g;
    scanf("%d",&n);

    for(int i=0;i<n;++i){
        scanf("%d %d %d", &a,&b,&g);
        a--,b--,g--;
        swap(shell_loc[a],shell_loc[b]);
        cnt[shell_loc[g]]++;
    }
    freopen("shell.out","w",stdout);
    printf("%d\n",max({cnt[0],cnt[1],cnt[2]}));
}