// AC 2024/11/28
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, s, t, m=0;
    scanf("%i %i %i", &n, &s, &t);
    int enemies[n] {0}, sums[n+1] {0};
    for(int i=0; i<n; i++){
        scanf("%i", &enemies[i]);
    }
    for(int i=1; i<=n; i++){
        sums[i]=sums[i-1]+enemies[i-1];
    }
    if(s*t>=n){
        printf("%i\n", sums[n]);
    }
    else{
        for(int i=0; i<=t; i++){
            int left = sums[i*s];
            int right = sums[n]-sums[n-((t-i)*s)];
            m = max(m, left+right);
        }
        printf("%i\n", m);
    }
    return 0;
}