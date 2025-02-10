// AC 2025/02/09
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    string names1[n], names2[n];
    unordered_map<string, string> pairs;
    for(int i=0; i<n; i++) cin >> names1[i];
    for(int i=0; i<n; i++) cin >> names2[i];

    for(int i=0; i<n; i++){
        if(names1[i]==names2[i]){
            cout << "bad" << endl;
            return 0;
        }

        auto it1 = pairs.find(names1[i]);
        auto it2 = pairs.find(names2[i]);

        if(it1==pairs.end() && it2==pairs.end()) pairs[names1[i]] = names2[i];
        
        else if((it1!=pairs.end() && it1->second!=names2[i]) || 
                (it2!=pairs.end() && it2->second!=names1[i])){
            cout << "bad" << endl;
            return 0;
        }
    }
    cout << "good" << endl;
    return 0;
}