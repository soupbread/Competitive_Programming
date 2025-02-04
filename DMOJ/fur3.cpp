// AC 2025/02/03
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    double mid;
    cin >> n;
    vector<int> clothes(n);
    for(int i=0; i<n; i++){
        cin >> clothes[i];
    }
    sort(clothes.begin(), clothes.end());
    if(clothes.size()%2==0){
        mid = (clothes[(clothes.size()-1)/2]+clothes[clothes.size()/2])/2.0;
    }
    else mid = clothes[(clothes.size()-1)/2];
    printf("%.1f\n", mid);
    return 0;
}