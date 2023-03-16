#include <iostream>

using namespace std;

class Samp{
    int numberOne;
    int numberTwo;

public:
    Samp(int a, int b)
    {
       numberOne = a;
       numberTwo = b;
    }

    int SumOFNumbers(){
        return numberOne + numberTwo;
    }
};

int main()
{
    int a, b;
    cout << "Enter first number: ";
    cin >> a;
    cout << "Enter second number: ";
    cin >> b;

    Samp sum(a, b);

    int sumOfNumbers = sum.SumOFNumbers();

    cout << "The sum of numbers is: " << sumOfNumbers;

    return 0;
}
