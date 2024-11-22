// AC 2024/11/21

#include <bits/stdc++.h>
using namespace std;

int main(){
    int s, e, f, cnt=0;;
    cin >> s >> e;
    for(int i=s;i<=e;i++){
        f=0;
        for(int j=2;j<=sqrt(i);j++){
            if(i%j==0){
                if(j==i/j) f++;
                else f+=2;
            }
        }
        if(f==2) cnt++;
    }
    cout << "The number of RSA numbers between " << s << " and " << e << " is " << cnt << endl;
}