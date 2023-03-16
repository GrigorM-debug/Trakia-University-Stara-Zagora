#include <iostream>

using namespace std;

class Calculator{
    double numberOne;
    double numberTwo;

public:
    Calculator(double a, double b)
    {
       numberOne = a;
       numberTwo = b;
    }

    double SumOFNumbers(){
        return numberOne + numberTwo;
    }

    double SubstractNumbers(){
        return numberOne - numberTwo;
    }

    double MultiplyNumbers(){
        return numberOne * numberTwo;
    }

    double DividingNumbers(){
        return numberOne / numberTwo;
    }
};

int main()
{
    double a, b;
    cout << "Enter first number: ";
    cin >> a;
    cout << "Enter second number: ";
    cin >> b;

    Calculator calculator(a, b);

    double sumOfNumbers = calculator.SumOFNumbers();

    double multiplyingNumbers = calculator.MultiplyNumbers();

    double dividingNumbers = calculator.DividingNumbers();

    double substractingNumbers = calculator.SubstractNumbers();

    cout << "The Sum of numbers is: " << sumOfNumbers << endl;
    cout << "Тhe result of the Subtraction is: " << substractingNumbers << endl;
    cout << "The result of Multiplication is: " << multiplyingNumbers << endl;
    cout << "The result of Dividing is: " << dividingNumbers << endl; 

    return 0;
}
