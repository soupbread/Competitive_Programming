// Initial attempt 2024/11/29
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, m, k, min_len = INT_MAX;
    bool can = false;
    scanf("%i %i %i", &n, &m, &k); // n = rows, m = cols
    vector<vector<int>> field(n, vector<int>(m, 1));
    vector<vector<int>> sums(n, vector<int>(m+1, 1));
    for(int i=0;i<n;i++) sums[i][0]=0;

    for(int i=0; i<m; i++){
        int a, b;
        scanf("%i %i", &a, &b);
        for(int j=a-1; j<b; j++){
            field[j][i] = 0;
        }
    }

    for(int i=1; i<n; i++){
        for(int j=1; j<=m; j++){
            sums[i][j] = sums[i][j-1]+field[i][j-1];
        }
    }

    // for(int i=0; i<=n; i++){
    //     for(int j=0; j<=m; j++){
    //         cout << sums[i][j] << " ";
    //     }
    //     cout << "\n";
    // }

    for(int left=1; left<=m; left++){
        int c_sum = 0;
        for(int right=left; right<n; right++){
            c_sum+=sums[right][m];
            if(c_sum>=k){
                min_len = min(right-left+1, min_len);
                can = true;
                break;
            }
        }
    }
    if(can) cout << min_len << endl;
    else cout << -1 << endl;
    return 0;
}