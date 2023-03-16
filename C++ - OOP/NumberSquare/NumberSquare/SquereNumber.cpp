#include <iostream>

using namespace std;

class Samp{
    int number;

public:
    Samp(int num)
    {
       number = num;
    }

    int numberSquere(){
        return number * number;
    }
};
int main()
{
    int num;
    cout << "Enter number: ";
    cin >> num;

    Samp squere(num);

    int squeredNumber = squere.numberSquere();

    cout << "Squere number: " << squeredNumber;

    return 0;
}
