// AC 2025/02/12
#include <bits/stdc++.h>
using namespace std;

int main(){
    int curr = 0;
    for(int i=0; i<10; i++){
        int n;
        cin >> n;
        curr+=n;
        if(curr==100) break;
        else if(curr>100){
            if(100-(curr-n)<curr-100){
                curr-=n;
                break;
            }
        }
    }
    cout << curr << endl;
}