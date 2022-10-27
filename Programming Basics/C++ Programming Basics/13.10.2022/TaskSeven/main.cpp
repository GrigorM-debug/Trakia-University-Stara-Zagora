//Task 7: Write a program that inputs a positive three-digit number and outputs the hundreds, tens, and ones digits on separate lines.

#include <iostream>
using namespace std;

int main()
{
    int number, h, t, u;
    cout << "Enter a positive three-digit number: " << endl;
    cin >> number;
    u = number % 10;
    t = (number / 10) % 10;
    h = (number / 100) % 10;
    cout << "Hundreds = """ <<h <<endl <<  "Tens = """ << t << endl <<  "Units = """ << u<<endl;
    return 0;

}
