// Initial attempt 2024/12/11
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, k;
    cin >> n >> k;
    vector<int> nums(n);
    int swaps[2][2];
    for(int i=1; i<=n; i++) nums[i-1]=i;
    for(int i=0; i<2; i++){
        for(int j=0; j<2; j++){
            int num;
            cin >> num;
            swaps[i][j]=num-1;
        }
    }
    for(int i=0; i<k; i++){
        for(int j=0; j<2; j++){
            int start = swaps[j][0], end = swaps[j][1];
            while(start<end){
                swap(nums[start], nums[end]);
                start++;
                end--;
            }
        }
    }
    for(int i=0; i<n; i++){
        cout << nums[i] << endl;
    }
}