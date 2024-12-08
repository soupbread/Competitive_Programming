// Initial attempt 2024/11/29
// Second attempt 2024/12/08
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, m, k, min_len = INT_MAX, r=n-1;
    bool can = false;
    scanf("%i %i %i", &n, &m, &k); // n = rows, m = cols
    vector<int> rows(n, m), sums(n+1, 0);
    for(int i=0; i<m; i++){
        int a, b;
        scanf("%i%i", &a, &b);
        for(int j=a-1; j<b; j++){
            rows[j]--;
        }
    }

    for(int i=1; i<=n; i++){
        sums[i]=sums[i-1]+rows[i-1];
    }

    for(int i=0; i<n; i++){
        for(int j=n-1; j>=i; j--){
            if(sums[j+1]-sums[i]>=k && j-i+1<min_len){
                can=true;
                min_len=j-i+1;
            }
        }
    }
    if(can) cout << min_len << endl;
    else cout << -1 << endl;
    return 0;
}