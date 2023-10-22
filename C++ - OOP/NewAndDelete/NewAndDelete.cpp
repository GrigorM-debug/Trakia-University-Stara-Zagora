#include <iostream>
using namespace std;


class Samp{
    public:
    int a;

    public:
    Samp(int number){
        a = number;
    }

    int Get_a(){
        return a;
    }

};


int main(){
    int number;
    cout << "Enter number: ";
    cin >> number;

    Samp* p;
    p = new Samp(number);

    cout << "Number is: " << p->Get_a() << endl;

    delete p;

    return 0;
}