// AC 2024/12/10
// Could've just used find()...
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    unordered_set<string> s;
    string m;
    cin >> n >> m;
    for(int len=1; len<=n; len++){
        s.clear();
        bool u=true;
        for(int i=0; i<=n-len; i++){
            string temp = m.substr(i, len);
            if(s.count(temp)){
                u=false;
                break;
            }
            s.insert(temp);
        }
        if(u){
            cout << len << endl;
            return 0;
        }
    }
    cout << n << endl;
    return 0;
}