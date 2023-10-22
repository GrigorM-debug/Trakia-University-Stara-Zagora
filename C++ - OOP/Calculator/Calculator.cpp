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
