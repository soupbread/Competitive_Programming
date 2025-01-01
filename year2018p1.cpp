// first attenpt 2024/12/31
#include <bits/stdc++.h>
using namespace std;

int main() {
    int h, m, s;
    cin >> h >> m >> s;

    long long total = h * 3600 + m * 60 + s;
    total = 43200 - total;
    
    while (total < 0) total += 43200;

    h = (total / 3600) % 12;
    m = (total / 60) % 60;
    s = total % 60;

    if (h == 0) h = 12;

    printf("%02d:%02d:%02d\n", h, m, s);

    return 0;
}