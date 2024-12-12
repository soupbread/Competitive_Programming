// Initial attempt 2024/12/11
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    vector<string> cows = {"Beatrice", "Bessie", "Belinda", "Bella", "Betsy", "Buttercup", "Blue", "Sue"};
    vector<string> ncows(7); 
    vector<vector<string>> d;
    scanf("%i", &n);
    cin.ignore();
    for(int i=0; i<n; i++){
        string c, temp;
        vector<string> de(2);
        getline(cin, c);
        de[0] = c.substr(0, c.find(' '));
        de[1] = c.substr(c.rfind(' ')+1, c.size()-c.rfind(' ')-1);
        d.push_back(de);
    }
    return 0;
}