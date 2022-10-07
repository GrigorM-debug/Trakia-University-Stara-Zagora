// Прочитане на две реални числа от конзолата. Пресмятане на сумата им и извеждане на сумата на екрана
//

#include <iostream>
using namespace std;

int main()
{
	double a, b, sum;
	cout << "Enter your first number: ";
	cin >> a;
	cout << "Enter your second number: ";
	cin >> b;
	sum = a + b;
	cout << "Your sum is: " << sum;
	return 0;
}


