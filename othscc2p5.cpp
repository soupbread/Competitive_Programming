#include <bits/stdc++.h>
using namespace std;

int main(){
    int cnt=0, n, m;
    char school[n][m+1];
    cin >> n >> m;
    for(int i=0; i<n; i++){
        string line;
        cin >> line;
        strcpy(school[i], line.c_str());
    }
    return 0;
}