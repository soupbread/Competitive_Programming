// TLE 2025/02/14...
#include <bits/stdc++.h>
using namespace std;

int main(){
    cout << "Ready" << endl;
    while(true){
        string p;
        cin >> p;
        char f = p[0], s = p[1];
        if(f==' ' && s==' ') break;
        else if((f=='b' && s=='d') || (f=='d' && s=='b')){
            cout << "Mirrored pair" << endl;
        }
        else if((f=='q' && s=='p') || (f=='p' && s=='q')){
            cout << "Mirrored pair" << endl;
        }
        else cout << "Ordinary pair" << endl;
    }
    return 0;
}