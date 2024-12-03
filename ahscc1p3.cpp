// initial attempt 2024/11/23
// AC 2024/12/03
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, maxe=0;
    cin >> n;
    char key[n+1], w[n];
    scanf("%s %s", key, w);
    int psa[n]={0}, ssa[n]={0};
    for(int i=0; i<n-1; i++){ // building psa
        if(key[i]==w[i]){
            psa[i+1]=psa[i]+1;
        }
        else psa[i+1]=psa[i];
    }
    for(int i=n-2; i>=0; i--){ // building ssa
        if(w[i]==key[i+1]){
            ssa[i]=ssa[i+1]+1;
        }
        else ssa[i]=ssa[i+1];
    }
    for(int i=0; i<n; i++){
        if(psa[i]+ssa[i]>maxe){
            maxe=psa[i]+ssa[i];
        }
    }
    printf("%i\n", maxe);
    return 0;
}