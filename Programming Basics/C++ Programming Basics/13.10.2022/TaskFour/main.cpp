// Task 4: To write a program that finds the root mean square of three real numbers, according to the formula:SqAvg=√((a^2+b^2+ c^2)/3)
//

#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    double a, b, c;
    double sqAverage;
    cout << "Enter 3 real number: " << endl;
    cin >> a >> b >> c;
    sqAverage = sqrt((a * a + b * b + c * c) / 3);
    cout << "The result is: " << sqAverage;
    return 0;
}