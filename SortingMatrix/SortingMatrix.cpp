#include<iostream>
using namespace std;

void SortingArray(int arr[], int n){
    for (int i = 0; i < n - 1; i++){
        for (int j = 0; j < n - i -1; j++){
            if (arr[j] > arr[j+1]){
                swap(arr[j], arr[j+1]);
            }
        }
    }
}

int main(){
    int n = 5;
    int count = 0;

    int matrix[n][n] = {
        {500, 550, 600, 562, 654},
        {560, 599, 5555, 5002, 4555},
        {12, 13, 45, 67, 68},
        {400, 344, 211, 455, 111},
        {21, 32, 45, 67, 78}
    };

    //Declare arrat to fill with numbers of the matrix
    int arr[n*n];

    //fill the array
    for (int i = 0; i < n; i++){
        for (int k = 0; k < n; k++){
            arr[count] = matrix[i][k];

            count++;
        }
    }

    //Sorting the array 
    SortingArray(arr, n*n);
    count = 0;

    //replace the numbers in the matrix witth the sorted numbers
    for (int x= 0; x < n; x++){
        for (int y = 0; y < n; y++){
            matrix[x][y] = arr[count];
            count++;
        }
    }

    //Printing the Sorted matrix
    for (int i = 0; i < n; i++){
        for (int j =0; j < n; j++){
            cout << matrix[i][j] << ' ';
        }
        cout << endl;
    }
    return 0;
}