// AC 2024/11/26

#include <bits/stdc++.h>
using namespace std;

int main(){
    int avg, num;
    cin >> avg >> num;
    int mark = 80*(num+1)-avg*num;
    if(mark<=100 && mark >= 0) cout << mark;
    else if(mark<0) cout << 0;
    else cout << -1;
    return 0;
}