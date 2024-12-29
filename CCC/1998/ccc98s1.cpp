// AC 2024/12/28
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    cin.ignore();
    for(int i=0; i<n; i++){
        string s, n="";
        getline(cin, s);
        
        int j = 0;
        while (j<s.length()) {
            int spacePos = s.find(' ', j);
            if (spacePos == string::npos) {
                spacePos = s.length();
            }
            string word = s.substr(j, spacePos - j);
            if (word.length() == 4) {
                cout << "****";
            }
            else cout << word;
            if(spacePos == s.length()) cout << endl;
            else cout << " ";
            j = spacePos + 1;
        }
    }
    return 0;
}