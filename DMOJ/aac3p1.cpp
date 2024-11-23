// AC 2024/11/22

#include <bits/stdc++.h>
using namespace std;

int main(){
    int a, b, c, d;
    scanf("%i %i %i %i", &a, &b, &c, &d);
    if(a<b && c<d) printf("%s\n", "Go to the department store");
    else if(a<b) printf("%s\n", "Go to the grocery store");
    else if(c<d) printf("%s\n", "Go to the pharmacy");
    else printf("%s\n", "Stay home");
}