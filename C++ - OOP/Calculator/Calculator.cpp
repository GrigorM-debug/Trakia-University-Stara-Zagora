<<<<<<< HEAD
#include <iostream>
#include<string>
using namespace std;

class Calculator{
    double numberOne;
    double numberTwo;
    char mathOperation;

public:
    Calculator(double a, double b, char op)
    {
       numberOne = a;
       numberTwo = b;
       mathOperation = op;
    }

    double Calculating(){
        double result;
        switch(mathOperation){
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            case '/':
                if (numberTwo == 0){
                    cout << "Cannot divide by zero !";
                    result = 0;
                    break;
                }
                else {
                    result = numberOne / numberTwo;
                }
                break;
            default:
                cout << "Invalid operator" << endl;
                result = 0;
                break;
        }
        return result;
    }
};

int main(){
    string input[3];
    cout << "Enter a calculation (e.g. 5 + 3): ";
    for (int i = 0; i < 3; i++){
        cin >> input[i];
    }
    double a = stod(input[0]);
    char op = input[1][0];
    double b = stod(input[2]);

    Calculator calculator(a, b, op);
    
    double result = calculator.Calculating();
    cout << "Result: " << result << endl;

    return 0;
}
=======
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
>>>>>>> 0b3bfcb765ec24bccabdcb7d97f170003407c1ef
