#include <bits/stdc++.h>

using namespace std;

int main(){
    int k, n, s;
    cin >> k >> n;
    for(int i=0;i<n;i++){
        cin >> s;
        if(k<=s){
            cout << "fight" << endl;
            exit(0);
        }
    }
    cout << "run away" << endl;
}