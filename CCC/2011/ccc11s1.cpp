// AC 2024/11/19

#include <bits/stdc++.h>

using namespace std;

int main(){
    int n, t_cnt=0, s_cnt=0;
    string sentence;
    cin >> n;
    cin.ignore();
    for(int i=0;i<n;i++){
        getline(cin, sentence);
        for(char ch : sentence){
            if(ch=='t' || ch=='T'){
                t_cnt++;
            }
            else if(ch=='s' || ch=='S'){
                s_cnt++;
            }
        }
    }
    if(s_cnt>=t_cnt){
        cout << "French" << endl;
    }
    else{
        cout << "English" << endl;
    }
}