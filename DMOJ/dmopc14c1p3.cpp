// AC 2025/01/19
#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    double n, s, total = 0, avg = 0;
    cin >> n;
    for(int i=0; i<n; i++){
        double m;
        cin >> m;
        total += m;
    }
    cin >> s;
    for(int i=0; i<s; i++){
        double m;
        cin >> m;
        total+=m;
        avg = total/(n+(i+1));
        printf("%.3f\n", avg);
    }
    return 0;
}