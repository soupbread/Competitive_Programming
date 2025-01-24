// TLE
#include <bits/stdc++.h>
using namespace std;

int main(){
    int t, cnt = 0;
    cin >> t;
    for(int i=0; i<t; i++){
        int n, lower = 45, upper = 49;
        cnt = 0;
        cin >> n;

        while(n >= lower){
            if(n < upper){
                cnt += n - lower + 1;
            }
            else cnt += upper - lower + 1;
            lower = 4 * pow(10, to_string(lower).length()) + lower;
            upper = upper * 10 + 9;
        }
        cout << cnt << endl;
    }
    return 0;
}