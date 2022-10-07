// Програма която прочита от конзолата страните a и b на правоъгълник.
// Пресмета периметъра и лицето и ги извежда на екрана

#include <iostream>
using namespace std;

int main()
{
    double a, b, perimeter, area;
    cout << "Enter the size of a: ";
    cin >> a;
    cout << "Enter the size of b: ";
    cin >> b;
    perimeter = (2 * a) + (2 * b);
    area = a * b;
    cout << "The perimeter of rectangle is: " << perimeter;
    cout << endl;
    cout << "The area of rectangle is: " << area;
    return 0;
}


