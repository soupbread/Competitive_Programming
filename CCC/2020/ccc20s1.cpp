// AC 2024/12/26
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    double maxs = 0;
    cin >> n;
    map<int, int> run;
    for(int i=0; i<n; i++){
        int t, x;
        cin >> t >> x;
        run.insert({t, x});
    }
    auto prev_it = run.end();
    for(auto it = run.begin(); it!=run.end(); it++){
        double speed;
        if(prev_it!=run.end()){
            speed = abs(it->second-prev_it->second)/(1.0*(it->first-prev_it->first));
        }
        if(prev_it!=run.end() && speed>maxs){
            maxs = speed;
        }
        prev_it = it;
    }
    cout << fixed << setprecision(1) << maxs << endl;
    return 0;
}