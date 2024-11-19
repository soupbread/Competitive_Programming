// AC 2024/11/16
// https://www.geeksforgeeks.org/how-to-create-vector-of-pairs-in-cpp/

#include <bits/stdc++.h>

using namespace std;

int main(){
    int l, n, s, t, maxx=0;
    vector<pair<int,int>> intervals, res;
    cin >> l >> n;

    for(int i=0;i<n;i++){
        cin >> s >> t;
        intervals.push_back(make_pair(s,t));
    }

    sort(intervals.begin(),intervals.end());
    res.push_back(intervals[0]);

    for(int i=1;i<intervals.size();i++){
        if(intervals[i].first<=res.back().second){
            res.back().second=max(res.back().second, intervals[i].second);
        }
        else{
            res.push_back(intervals[i]);
        }
    }

    if(size(res)>1){
        for(int i=1;i<res.size();i++){
            if(res[i].first-res[i-1].second>maxx){
                maxx=res[i].first-res[i-1].second;
            }
        }
    }
    else{
        maxx = max(res[0].first-0,l-res[0].second);
    }

    cout << maxx;
}