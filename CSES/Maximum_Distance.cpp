// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    int n,max=0;
    scanf("%i",&n);
    int x[n],y[n];
    for(int i=0;i<n;i++){
        scanf("%i",&x[i]);
    }
    for(int i=0;i<n;i++){
        scanf("%i",&y[i]);
    }
    for(int i=0;i<n;i++){
        int xc=x[i],yc=y[i],dis;
        for(int j=0;j<n;j++){
            dis=pow(xc-x[j],2)+pow(yc-y[j],2);
            if(dis>max) max=dis;
        }
    }
    printf("%i",max);
}