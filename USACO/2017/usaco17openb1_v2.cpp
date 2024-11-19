// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    freopen("lostcow.in","r",stdin);
    freopen("lostcow.out","w",stdout);
    int x,y,dis=0,dir=1,move=1;
    scanf("%i %i",&x,&y);
    while(true){
        if(dir<0 && x>=y && y>=x-move || dir>0 && x<=y && y<=x+move){
            dis+=abs(x-y);
            printf("%i\n",dis);
            break;
        }
        else{
            dis+=move*2; // has to move and back again, thus*2
            move*=2;
            dir*=-1;
        }
    }
}