// AC 2024/12/20
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, ecnt=0, ocnt=0;
    cin >> n;
    for(int i=0; i<n; i++){
        int a;
        cin >> a;
        if(a%2==0) ecnt++;
        else ocnt++;
    }
    cout << int((ecnt/2)+(ocnt/2)) << endl;
    return 0;
}