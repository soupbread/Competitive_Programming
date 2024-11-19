// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    // freopen("inin.in","r",stdin);
    int n, min_x=100, max_x=0, min_y=100, max_y=0;
    scanf("%i",&n);
    for(int i=0;i<n;i++){
        int x,y;
        scanf("%i,%i",&x,&y);
        min_x=min(x,min_x);
        max_x=max(x,max_x);
        min_y=min(y,min_y);
        max_y=max(y,max_y);
    }
    printf("%i,%i\n%i,%i",min_x-1,min_y-1,max_x+1,max_y+1);
}