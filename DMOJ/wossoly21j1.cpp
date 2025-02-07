// AC 2025/02/06
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    if(n<=0) cout << "S" << endl;
    else if(n<100) cout << "L" << endl;
    else cout << "G" << endl;
    return 0;
}