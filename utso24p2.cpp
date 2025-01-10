#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, k, pos_ind = 0, neg_ind = 0, ans=0;
    vector<int> pos_gifts, neg_gifts;
    cin >> n >> k;
    int moves = k;

    for(int i=0; i<n; i++){
        int h;
        cin >> h;
        if(h>0) pos_gifts.push_back(h);
        else if(h<0) neg_gifts.push_back(h);
    }

    sort(pos_gifts.begin(), pos_gifts.end(), greater<>());
    sort(neg_gifts.begin(), neg_gifts.end());

    while(moves>0){
        int pos_1 = 0, pos_2 = 0, neg = 0;

        if(moves==1){
            if(pos_gifts.size()>0 && pos_ind<int(pos_gifts.size())){
                ans+=pos_gifts[pos_ind];
            }
            break;
        }
        else{
            if(pos_gifts.size()>0 && pos_ind<int(pos_gifts.size())-1){
                pos_1 = pos_gifts[pos_ind], pos_2 =  pos_gifts[pos_ind+1];
            }
            else if(pos_gifts.size()>0 && pos_ind<=int(pos_gifts.size())-1){
                pos_1 = pos_gifts[pos_ind];
            }
            if(neg_gifts.size()>0 && neg_ind<int(neg_gifts.size())){
                neg = abs(neg_gifts[neg_ind]);
            }
            if(pos_1 + pos_2 > neg){
                moves--;
                ans+=pos_1;
                pos_ind++;
            }
            else{
                moves-=2;
                ans+=neg;
                neg_ind++;
            }
        }
    }
    cout << ans << endl;
    return 0;
}
