// Task 3: Given the positive real numbers m, n, p, q, r, s, t. To calculate the value of f, where: f=m+n/(p+q/(r+s/t))

#include <iostream>
using namespace std;

int main () {
    double m, n, p, q, r, s, t;
	double f;
	cout << "Enter 7 real numbers: " << endl;
	cin >> m >> n >> p >> q >> q >> r >> s >> t;
	f = m + n / (p + q / (r + s / t));
	cout << "Result: " << f;
	return 0;
}