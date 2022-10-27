// To calculate the value of f, where x is a positive real number

#include <iostream>
#include <cmath>
using namespace std;

int main () {
    double x, result;
    cout << "Enter the value of x: ";
    cin >> x;
    double e = 2.718281828459045;
    result = sin(sin(sin(x))) + cos(cos(cos(x))) / log10(x) + cos(x) + e*x*x;
    cout << "The result is: " << result;
    
    return 0;
}