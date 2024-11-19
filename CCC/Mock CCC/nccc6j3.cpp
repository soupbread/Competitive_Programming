// AC 2024/11/18

#include <bits/stdc++.h>

using namespace std;

int main(){
    int t, a, b, n;
    cin >> t;
    for(int i=0;i<t;i++){
        cin >> a >> b >> n;
        bool can_buy = false;
        for(int amt_sashimi=0;amt_sashimi<=n/a;amt_sashimi++){
            if((n-amt_sashimi*a)%b==0){
                can_buy = true;
                break;
            }
        }
        if(can_buy) cout << "YES" << "\n";
        else cout << "NO" << "\n";
    }
}