// AC 2024/12/02
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, m, k=0;
    cin >> n >> m;
    int desks[n][m];
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(i%2==0){
                if(j%2==0){
                    desks[i][j]=1;
                    if(k<1) k=1;
                }
                else{
                    desks[i][j]=2;
                    if(k<2) k=2;
                }
            }
            else{
                if(m>1 && j%2==0){
                    desks[i][j]=3;
                    if(k<3) k=3;
                }
                else if(j%2==0){
                    desks[i][j]=2;
                    if(k<2) k=2;
                }
                else{
                    desks[i][j]=4;
                    k=4;
                }
            }
        }
    }
    cout << k << endl;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cout << desks[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}