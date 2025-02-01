#include <bits/stdc++.h>
using namespace std;

int isFeasible(vector<int> words, int w, int l){
    int curr = 0;
    for(int i=0; i<words.size(); i++){
        
    }
}

int bSearch(vector<int> arr, int min, int max, int key){
    while(min<=max){
        int mid=min+(max-min)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            min=mid+1;
        }
        else max=mid-1;
    }
    return -1;
}

int main(){
    long long n, l, s, minl=0, curr=0;
    cin >> n >> l >> s;
    vector<long  long> words(n), widths;
    for(int i=0; i<n; i++){
        cin >> words[i];
        minl=max(minl, words[i]);
    }
    sort(words.begin(), words.end());
    long long maxl = accumulate(words.begin(), words.end(), 0)+s*(n-1);
    for(long long i=minl; i<=maxl; i+=words[curr]+s){
        widths.push_back(i);
        if(i>minl) curr++;
    }

    return 0;
}