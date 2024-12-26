// AC 2024/12/25
#include <bits/stdc++.h>
using namespace std;

int sumacSeq(int t1, int t2, int cnt) {
    if(t1<t2) return cnt;
    return sumacSeq(t2, abs(t1-t2), cnt + 1);
}

int main() {
    int t1, t2;
    cin >> t1 >> t2;
    cout << sumacSeq(t1, t2, 2) << endl;
    return 0;
}