<<<<<<< HEAD
#include <iostream>
using namespace std;

//declare class
class Wall {
    private:
    double length;
    double heigth;

    public:
    //parameterrized constructor in initialize variables
    Wall(double lan, double hgt) {
        length = lan;
        heigth = hgt;
    }

    double calculateArea() {
        return heigth * length;
    }
};

int main() {
    //create object and initialize data members
    Wall wall1(10.5, 8.6);
    Wall wall2(8.5, 6.3);

    cout << "Area of wall 1: " << wall1.calculateArea() << endl;
    cout << "Area if wall 2: " << wall2.calculateArea() << endl;

    return 0;
=======
#include <iostream>
using namespace std;

//declare class
class Wall {
    private:
    double length;
    double heigth;

    public:
    //parameterrized constructor in initialize variables
    Wall(double lan, double hgt) {
        length = lan;
        heigth = hgt;
    }

    double calculateArea() {
        return heigth * length;
    }
};

int main() {
    //create object and initialize data members
    Wall wall1(10.5, 8.6);
    Wall wall2(8.5, 6.3);

    cout << "Area of wall 1: " << wall1.calculateArea() << endl;
    cout << "Area if wall 2: " << wall2.calculateArea() << endl;

    return 0;
>>>>>>> 0b3bfcb765ec24bccabdcb7d97f170003407c1ef
}