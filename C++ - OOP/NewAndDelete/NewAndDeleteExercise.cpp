#include <iostream>
using namespace std;

class Samp{
    private:
    int i;
    int j;

    public:
    Samp(){
        i = 0;
        j = 0;
    }

    Samp(int x, int y){
        i = x;
        j = y;
    }
    int get_product(){
        return i * j;
    }

    ~Samp(){
        cout << "Destructured!" << endl;
    }
};

int main (){
    Samp *arr;
    arr = new Samp[10];

    //Samp *p[10];

    for (int i =0; i < 10; i++){
        //p[i] = new Samp;
        //*(p+i) = new Samp;
        arr[i]= Samp(i, i+1);
    }

    for (int x = 0; x < 10; x++){
        cout << "The product is: " << arr[x].get_product() << endl;
        //delete p[x];s
    }

    delete [] arr;
    //delete p;
    return 0;
}

