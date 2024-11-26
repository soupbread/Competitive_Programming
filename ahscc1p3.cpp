// misunderstood question
// initial attempt like 2024/11/23

#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, ind=0, ind2=0, score=0;
    string key, will;
    bool found = false;
    scanf("%i\n%s\n%s", &n, &key, &will);
    while(ind<n){
        if(key[ind]==will[ind2]){
            ind++;
            ind2++;
            score++;
        }
        else{
            ind++;
            // nope hahahahahahahahahaha i misunderstood question
        }
    }
}