// AC 2024/12/31
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n1, n2, n3;
    cin >> n1 >> n2 >> n3;
    cout << max({n1, n2, n3}) - min({n1, n2, n3}) << endl;
    return 0;
}