<<<<<<< HEAD
#include <iostream>
using namespace std;

class samp{
    int a;

    public:
        void set_a(int n){
            a=n;
        }
        int get_a(){
            return a;
        }
};

int main(){
    int num = 20;

    samp obj[4];
    
    for (int i = 0; i < 4;i++){
        obj[i].set_a(i);
    }

    for (int j = 0; j < 4; j ++){
        cout << obj[j].get_a()<< ' ';
    }
    

    return 0;
=======
#include <iostream>
using namespace std;

class samp{
    int a;

    public:
        void set_a(int n){
            a=n;
        }
        int get_a(){
            return a;
        }
};

int main(){
    int num = 20;

    samp obj[4];
    
    for (int i = 0; i < 4;i++){
        obj[i].set_a(i);
    }

    for (int j = 0; j < 4; j ++){
        cout << obj[j].get_a()<< ' ';
    }
    

    return 0;
>>>>>>> 0b3bfcb765ec24bccabdcb7d97f170003407c1ef
}