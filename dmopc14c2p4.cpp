// AC 2024/11/28
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, m, q;
    scanf("%i", &n);
    int arr[n] {0}, sums[n+1] {0};
    for(int i=0;i<n;i++){
        scanf("%i", &m);
        arr[i] = m;
    }
    for(int i=1; i<=n; i++){
        sums[i] = sums[i-1] + arr[i-1];
    }
    scanf("%i", &q);
    for(int i=0; i<q; i++){
        int a, b;
        scanf("%i %i", &a, &b);
        printf("%i\n", sums[b+1]-sums[a]);
    }
    return 0;
}