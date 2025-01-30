// AC 2025/01/29
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, d = 0;
    cin >> n;
    vector<int> cows(n), monkeys(n);
    for(int i=0; i<n; i++){
        cin >> cows[i];
    }
    for(int i=0; i<n; i++){
        cin >> monkeys[i];
    }
    sort(cows.begin(), cows.end());
    sort(monkeys.begin(), monkeys.end());
    for(int i=0; i<n; i++){
        d = max(d, abs(cows[i]-monkeys[i]));
    }
    cout << d << endl;
    return 0;
}