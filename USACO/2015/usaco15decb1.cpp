// AC

#include <bits/stdc++.h>
#include <vector>

using namespace std;

int main(){
    freopen("paint.in","r",stdin);
    freopen("paint.out","w",stdout);

    vector<bool> cover(100);

    int a,b,c,d,ans;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    // printf("%d", max({a,b,c,d})-min({a,b,c,d})); Why does this not work??
    // Answer: because the two sections are not guaranteed to overlap
    // Taking just the max and min into account may neglect the unpainted middle portion
    for(int i=a;i<b;i++) cover[i]=true;
    for(int i=c;i<d;i++) cover[i]=true;
    for(int i=0;i<cover.size();i++) ans+=cover[i];
    printf("%d",ans);
}