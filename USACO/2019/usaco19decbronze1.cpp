// AC 2024/12/1
#include <bits/stdc++.h>
using namespace std;

int main(){
    int k1, n, cnt=0;
    cin >> k1 >> n;
    vector<vector<int>> cows(k1, vector<int>(n));
    for(int i=0; i<k1; i++){
        for(int j=0; j<n; j++){
            cin >> cows[i][j];
        }
    }
    for(int i=1; i<=n; i++){
        for(int j=i+1; j<=n; j++){
            bool cons1 = true, cons2 = true;
            int cow1=0, cow2=0;
            for(int k=0; k<k1; k++){
                for(int c=0; c<n; c++){
                    if(cows[k][c]==i) cow1 = c;
                    else if(cows[k][c]==j) cow2 = c;
                }
                if(cow1>cow2) cons2 = false;
                else if(cow2>cow1) cons1 = false;
            }
            if(cons1 || cons2){
                cnt++;
            }
        }
    }
    cout << cnt << endl;
}