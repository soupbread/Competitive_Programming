// TLE 2025/02/14... (cin skips spaces)
// AC 2025/02/15
#include <bits/stdc++.h>
using namespace std;

int main(){
    cout << "Ready" << endl;
    while(true){
        string p;
        getline(cin, p);
        if(p=="  ") break;
        else if(p=="bd" || p=="db" || p=="pq" || p=="qp"){
            cout << "Mirrored pair" << endl;
        }
        else cout << "Ordinary pair" << endl;
    }
    return 0;
}