// AC 2024/11/29
#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    long long sides[3];
    for(int i=0; i<t; i++){
        cin >> sides[0] >> sides[1] >> sides[2];
        sort(sides, sides+3);
        if(sides[0]*sides[0]+sides[1]*sides[1]==sides[2]*sides[2]){
            cout << "R" << endl;
        }
        else if(sides[0]*sides[0]+sides[1]*sides[1]>sides[2]*sides[2]        ){
            cout << "A" << endl;
        }
        else cout << "O" << endl;
    }
    return 0;
}