// AC

#include <bits/stdc++.h>

using namespace std;

int main(){
    int n,cnt=0;
    scanf("%i",&n);
    for(int i=0;i<n;i++){
        int thCnt=0;
        for(int j=0;j<3;+j++){
            int curr;
            cin >> curr;
            if(curr==1) thCnt++;
        }
        if(thCnt>=2){
            cnt++;
        }
    }
    cout << cnt;
}