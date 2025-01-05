// AC 2024/01/04
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, c=0;
    cin >> n;
    vector<char> student, correct;
    for(int i=0; i<n; i++){
        char a;
        cin >> a;
        student.push_back(a);
    }
    for(int i=0; i<n; i++){
        char a;
        cin >> a;
        correct.push_back(a);
    }
    for(int i=0; i<n; i++){
        if(student[i]==correct[i]) c++;
    }
    cout << c << endl;
    return 0;
}