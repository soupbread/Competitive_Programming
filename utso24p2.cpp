// First attempt 2025/01/05
#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n, k, ans=0, back=false;
    vector<int> gifts;
    cin >> n >> k;
    for(int i=0; i<n; i++){
        int g;
        cin >> g;
        gifts.push_back(g);
    }
    sort(gifts.begin(), gifts.end(), greater<>());
    for(int i=0; i<n; i++){
        cout << gifts[i] << " ";
    }
    if(k==1){
        for(int i=0; i<n; i++){
            if(gifts[i]>0){
                ans+=gifts[i];
                break;
            }
        }
    }
    else if(n==1) ans+=abs(gifts[0]);
    else{
        for(int i=0; i<n-1; i+=2){
            if(gifts[i]>0 && gifts[i+1]>0 && gifts[i]+gifts[i+1]>=abs(gifts[n-1])){
                ans+=gifts[i]+gifts[i+1];
                k-=2;
            }
            else if(gifts[i]>0 && gifts[i+1]>0 && gifts[i]+gifts[i+1]<abs(gifts[n-1])){
                k-=2;
                back=true;
                ans+=abs(gifts[n-1]);
                break;
            }
            else if(gifts[i]<0 || gifts[i+1]<0){
                if(gifts[i]<0){
                    back=true;
                    break;
                }
                if(gifts[i+1]<0){
                    if(gifts[i]+gifts[i+1]>abs(gifts[n-1])){
                        k-=2;
                        ans+=gifts[i]+gifts[i+1];
                        back=true;
                        break;
                    }
                    back=true;
                }
            }
        }
    }
    // if(back && k>0){
        
    // }
    cout << ans << endl;
    return 0;
}