// AC 2024/11/23

#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, min_ind=0;
    cin >> n;
    string words[n], word;
    for(int i=0; i<n; i++){
        cin >> words[i];
    }
    cin >> word;
    for(int i=1;i<n;i++){
        if(fabs(word.length()-words[i].length())<fabs(word.length()-words[min_ind].length())){
            min_ind = i;
        }
    }
    cout << words[min_ind];
}