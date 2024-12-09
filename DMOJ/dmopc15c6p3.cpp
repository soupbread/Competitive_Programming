// Initial attempt 2024/11/29
// Second attempt 2024/12/07
// THIRD attempt 2024/12/08
// AC 2024/12/08
#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n, m, k, w = LLONG_MAX, l=0, r=0;
    scanf("%lld %lld %lld", &n, &m, &k);
    vector<long long> dif(n+1, 0), rows(n+1, m), psa(n+1, 0);
    if(!k) printf("0");
    else{
        for(int i=0; i<m; i++){
            int a, b;
            scanf("%i %i", &a, &b);
            dif[a-1]--; dif[b]++;
        }
        for(int i=1; i<=n; i++) rows[i]=rows[i-1]+dif[i-1];
        for(int i=1; i<=n; i++) psa[i]=rows[i]+psa[i-1];

        for(r=0; r<=n; r++){
            while(psa[r]-psa[l]>=k){
                if(r-l<w) w=r-l;
                l++;
            }
        }
        if(w!=LLONG_MAX) printf("%lld", w);
        else printf("-1");
    }
    return 0;

    // previous attempt (naive)
    // bool can = false;
    // scanf("%i %i %i", &n, &m, &k); // n = rows, m = cols
    // if(k==0){
    //     cout << 0 << endl;
    //     exit(0);
    // }
    // vector<int> rows(n, m), sums(n+1, 0);
    // for(int i=0; i<m; i++){
    //     int a, b;
    //     scanf("%i%i", &a, &b);
    //     for(int j=a-1; j<b; j++){
    //         rows[j]--;
    //     }
    // }

    // for(int i=1; i<=n; i++){
    //     sums[i]=sums[i-1]+rows[i-1];
    // }

    // for(int i=0; i<n; i++){
    //     for(int j=n-1; j>=i; j--){
    //         if(sums[j+1]-sums[i]>=k && j-i+1<min_len){
    //             can=true;
    //             min_len=j-i+1;
    //         }
    //     }
    // }
    // if(can) cout << min_len << endl;
    // else cout << -1 << endl;
}