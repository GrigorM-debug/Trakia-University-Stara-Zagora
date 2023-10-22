#include <iostream>
using namespace std;

class samp{
    int a;
    int b;

    public:
    samp(int x, int y){
        a= x;
        b=y;
    }
        // void set_a(int n){
        //     a=n;
        // }
        int get_a(){
            return a;
        }
        int get_b(){
            return b;
        }
};

int main(){
    samp ob[4] = {
        samp(1,2),
        samp(3, 4),
        samp(5, 6),
        samp(7, 8)};

    int i;
    samp *p;
    p = ob; // get starting address of the array

    for (i = 0; i < 4; i++){
        cout << p -> get_a() << ' ';
        cout << p -> get_b() << "\n";
        p++;
    }
    cout << "\n";
    return 0;
}