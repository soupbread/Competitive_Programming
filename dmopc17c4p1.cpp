// attempt 02/04
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, q, cnt = 0;
    cin >> n >> q;
    map<int, int> queries;
    for(int i=0; i<q; i++){
        int x, y;
        cin >> x >> y;
        queries[x] = max(queries[x], y);
    }

    return 0;
}