// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    freopen("lostcow.in","r",stdin);
    freopen("lostcow.out","w",stdout);

    int x,y,move=1,total=0,ori;
    scanf("%i %i",&x,&y);
    ori=x;

    while(true){
        total+=abs(move)+abs(x-ori);
        x=ori+move;
        move*=-2;
        if(ori>y && x<=y) break;
        else if(ori<y && x>=y) break;
    }
    total-=abs(y-x);
    printf("%i",total);
}