// Task 5: Write a program that finds the arithmetic mean of two integers
//

#include <iostream>
using namespace std;

int main()
{
	double numberOne, numberTwo;
	cout << "Enter 2 real numbers: " << endl;
	cin >> numberOne >> numberTwo;
	double average = (numberOne + numberTwo) / 2;
	cout << "The result is: " << average;
	return 0;
}