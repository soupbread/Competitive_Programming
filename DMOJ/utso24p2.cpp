// First attempt 2025/01/05
// AC 2025/01/10
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(){
    ll n, k, pos_ind = 0, neg_ind = 0, ans=0;
    vector<ll> pos_gifts, neg_gifts;
    cin >> n >> k;
    ll moves = k;

    for(long long i=0; i<n; i++){
        ll h;
        cin >> h;
        if(h > 0) pos_gifts.push_back(h);
        else if(h < 0) neg_gifts.push_back(h);
    }

    sort(pos_gifts.begin(), pos_gifts.end(), greater<ll>());
    sort(neg_gifts.begin(), neg_gifts.end());

    if(moves % 2 == 1){
        if(pos_gifts.size() > 0 && pos_ind < ll(pos_gifts.size())){
            ans+=pos_gifts[pos_ind];
            pos_ind++;
        }
        moves--;
    }

    while(moves > 0){
        ll pos_1 = 0, pos_2 = 0, neg = 0;
        
        if(pos_gifts.size() > 0 && pos_ind < ll(pos_gifts.size())-1){
            pos_1 = pos_gifts[pos_ind], pos_2 =  pos_gifts[pos_ind + 1];
        }
        else if(pos_gifts.size() > 0 && pos_ind <= ll(pos_gifts.size())-1){
            pos_1 = pos_gifts[pos_ind];
        }
        if(neg_gifts.size() > 0 && neg_ind < ll(neg_gifts.size())){
            neg = abs(neg_gifts[neg_ind]);
        }
        if(pos_1 + pos_2 > neg){
            ans += pos_1 + pos_2;
            pos_ind += 2;
        }
        else{
            ans += neg;
            neg_ind++;
        }
        moves -= 2;
    }
    cout << ans << endl;
    return 0;
}