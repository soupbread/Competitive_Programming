// AC 2024/11/30
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, total=0;
    cin >> n;
    for(int i=0;i<n;i++){
        int num;
        cin >> num;
        total+=abs(num);
    }
    cout << total;
}