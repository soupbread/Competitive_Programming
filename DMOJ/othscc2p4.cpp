// AC 2024/11/25
// Initial attempt 2024/11/20

#include <bits/stdc++.h>
using namespace std;

int main(){
    unordered_map<int, pair<int, int>> barrier;
    int n, m, q;
    scanf("%i %i %i", &n, &m, &q);
    for(int i=1; i<=n; i++){
        for(int j=1; j<=m; j++){
            int a;
            scanf("%i", &a);
            barrier[a] = {i, j};
        }
    }
    for(int i=0; i<q; i++){
        int k, r_1, c_1, r_2, c_2;
        scanf("%i %i %i %i %i", &k, &r_1, &c_1, &r_2, &c_2);
        auto iterator = barrier.find(k);
        if(iterator != barrier.end()){
            int row = iterator->second.first, col = iterator->second.second;
            if(r_2>=row && row>=r_1 && c_2>=col && col>=c_1){
                printf("yes\n");
                continue;
            }
        }
        printf("no\n");
    }
    return 0;

    // Brute force TLE
    // int n, m, q;
    // bool found = false;
    // scanf("%i %i %i", &n, &m, &q);
    // vector<vector<int>> barriers(n, vector<int>(m, 0));

    // for(int i=0; i<n; i++){
    //     for(int j=0; j<m; j++){
    //         scanf("%i", &barriers[i][j]);
    //     }
    // }
    // for(int i=0; i<q; i++){
    //     int k, r_1, c_1, r_2, c_2;
    //     scanf("%i %i %i %i %i", &k, &r_1, &c_1, &r_2, &c_2);
    //     found = false;
    //     for(int j=r_1-1; j<r_2; j++){
    //         for(int b=c_1-1; b<c_2; b++){
    //             if(barriers[j][b]==k){
    //                 found = true;
    //                 break;
    //             }
    //         }
    //     }
    //     if(found) printf("%s", "yes\n");
    //     else printf("%s", "no\n");
    // }
}