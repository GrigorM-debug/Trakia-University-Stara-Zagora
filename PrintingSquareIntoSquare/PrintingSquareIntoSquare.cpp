#include <iostream>
 
using namespace std; 
void printFullRow(int length){
    
    for(int x = 0; x < length; x++){
        cout << "* ";
    } 
        
    cout << endl;
} 
 
void printEmptyRow(int length, int count){
 
    for(int x = 0; x < length; x++){
            if(x < count || x >= length - count){
                cout << "* ";
                continue;
            } 
            cout << "  ";
        }  
    cout << endl;
}
 
void printSquare(int length, int count){
    
    for(int x = 0; x < length; x++){
        if(x < count || x >= length - count){
            printFullRow(length);
            continue;
        }
        
        printEmptyRow(length, count);
    }
}
 
int main(){
    int length = 20; 
    int count = 4; 
    
    printSquare(length, count);
    return 0;
}