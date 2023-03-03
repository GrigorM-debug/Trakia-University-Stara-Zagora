//C++ program to demostrate the use of constructor

#include <iostream>
using namespace std;

//declaring the class
class Wall {
    private:
    double lenght;

    public:
    //default constructor to initialize variable
    Wall() {
        lenght = 5.5;
        cout << "Creating a wall." << endl;
        cout << "Lenght = " << lenght << endl;
    }
};

int main() {
    Wall wall1;

    return 0;
}