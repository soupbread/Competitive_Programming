// AC 2025/02/07
#include <bits/stdc++.h>
#include <cmath>
using namespace std;

int main(){
    for(int i=0; i<5; i++){
        int x1, y1, x2, y2;
        cin >> x1 >> y1 >> x2 >> y2;
        double a1 = atan2(y1, x1)*(180.0/M_PI);
        double a2 = atan2(y2, x2)*(180/M_PI);
        double a = a1-a2;
        if(a<0) a+=360;
        printf("%.1f\n", a);
    }
    return 0;
}