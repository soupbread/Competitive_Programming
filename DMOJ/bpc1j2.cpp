#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int nums[n];
    for(int i=0; i<n; i++){
        cin >> nums[i];
    }
    int mind=nums[0];
    for(int i=1; i<n; i++){
        mind=gcd(mind, nums[i]);
    }
    for(int i=0; i<n; i++){
        cout << nums[i]/mind;
        if(i!=n-1) cout << " ";
    }
    cout << endl;
    return 0;
}