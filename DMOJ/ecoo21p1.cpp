// AC 2025/02/04
#include <bits/stdc++.h>
using namespace std;

int main(){
    int start, interval, larry;
    cin >> start >> interval >> larry;
    for(int i=0; i<3; i++){
        start+=interval;
        if(start>=larry){
            cout << start << endl;
            exit(0);
        }
    }
    cout << "Who knows..." << endl;
    return 0;
}