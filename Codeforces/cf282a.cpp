// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    int n,x=0;
    cin >> n;
    for(int i=0;i<n;i++){
        string line;
        cin >> line;
        if(line[1]=='+') x++;
        else x--;
    }
    cout << x;
}