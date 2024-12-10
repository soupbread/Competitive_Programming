// Initial attempt 2024/11/30
// Second attempt 2024/12/09
// AC 2024/12/09
// Note: alternate solution learned from DMOJ submission https://dmoj.ca/src/5615632
// to go through each index in the input array as the midpoint
// and computing all possible subarrays with that index as the midpoint
// then updating the answers array with the smallest value
// found through doing those calculations for each length

#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, r, minv;
    scanf("%i", &n);
    vector<int> m(n);
    vector<vector<int>> d(n, vector<int>(n, 0));
    for(int i=0; i<n; i++) scanf("%i", &m[i]);

    for(int len=2; len<=n; len++){
        for(int l=0; l+len-1<n; l++){
            r=l+len-1;
            d[l][r]=d[l+1][r-1]+abs(m[l]-m[r]);
        }
    }

    for(int len=1; len<=n; len++){
        minv=INT_MAX;
        for(int l=0; l+len-1<n; l++){
            r=l+len-1;
            minv=min(d[l][r], minv);
        }
        printf("%i ", minv);
    }

    return 0;

    // initial brute force attempt
    // for(int i=2; i<=n; i++){
    //     int l = 0, r = l+i-1, mini=INT_MAX, total=0;
    //     while(r<n){
    //         total = 0;
    //         for(int j=0; j<=(r-l)/2; j++){
    //             total+=abs(m[l+j]-m[r-j]);
    //         }
    //         mini = min(total, mini);
    //         l++, r++;
    //     }
    //     if(i<n) cout << mini << " ";
    //     else cout << mini;
    // }
}