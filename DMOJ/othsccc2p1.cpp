// AC 2024/11/20

#include <bits/stdc++.h>

using namespace std;

int main(){
    string piece;
    cin >> piece;
    if(piece=="queen") cout << 9 << endl;
    else if(piece=="rook") cout << 5 << endl;
    else if(piece=="bishop" || piece=="knight") cout << 3 << endl;
    else if(piece=="pawn") cout << 1 << endl;
    else cout << "priceless" << endl;
}