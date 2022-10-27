// Task 6.cpp : To write a program that inputs two real variables. To exchange their valuesand display them on the screen.
//

#include <iostream>
using namespace std;

int main()
{
	double numberOne, numberTwo;
	cout << "Enter two numbers: " << endl;
	cin >> numberOne >> numberTwo;
	double numberOneChaged = numberTwo;
	double numberTwoChaged = numberOne;
	cout << "First number is: " << numberOneChaged << endl;
	cout << "Second number is: " << numberTwoChaged << endl;
	return 0;
}