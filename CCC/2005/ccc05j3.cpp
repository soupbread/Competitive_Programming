// AC 2025/01/02
#include <bits/stdc++.h>
using namespace std;

int main(){
    vector<string> dirs, places;
    string d, p;
    cin >> d >> p;
    while(p!="SCHOOL"){
        dirs.push_back(d);
        places.push_back(p);
        cin >> d >> p;
    }
    dirs.push_back(d);
    places.push_back(p);
    for(int i=dirs.size()-1; i>0; i--){
        cout << "Turn ";
        if(dirs[i]=="R") cout << "LEFT onto ";
        else cout << "RIGHT onto ";
        cout << places[i-1] << " street." << endl;
    }
    cout << "Turn ";
    if(dirs[0]=="R") cout << "LEFT into your HOME." << endl;
    else cout << "RIGHT into your HOME. " << endl;
    return 0;
}