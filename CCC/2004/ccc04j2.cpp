// AC 2024/12/27
#include <bits/stdc++.h>
using namespace std;

int main(){
    int x, y;
    cin >> x >> y;
    for(int i=x; i<=y; i+=60){
        cout << "All positions change in year " << i << endl;
    }
    return 0;
}