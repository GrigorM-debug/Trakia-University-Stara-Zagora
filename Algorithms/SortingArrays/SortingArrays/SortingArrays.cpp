// SortingArrays.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;

//Insertion sort
void InsertionSort(int array[], int size) {
    for (int step = 1; step < size; step++) {
        int index = array[step];
        int dec = step;
        while (dec > 0 && array[dec - 1] >= index) {
            array[dec] = array[dec - 1];
            dec--;
        }
        array[dec] = index;
    }
}

//BubbleSort
void BubbleSort(int array[], int size) {
    for (int i = 1; i < size; i++) {
        for (int j = size - 1; j >= i; j--) {
            if (array[j - 1] > array[j]) {
                int curr = array[j];
                array[j] = array[j - 1];
                array[j - 1] = curr;
            }
        }
    }
}

//Selection Sort
void SelectioSort(int array[], int size) {
    for (int i = 0; i < size; i++) {
        int min = i;
        for (int j = i; j < size; j++) {
            if (array[min] > array[j]) {
                min = j;
            }
        }

        int curr = array[min];
        array[min] = array[i];
        array[i] = curr;
    }
}

//Display array on the screen
void PrintArray(int array[], int size) {
    for (int i = 0; i < size; i++) {
        cout << array[i] << " ";
    }
    cout << endl;
}

int main()
{
    int data[] = { 0,5,3,4,17,2,14,12,7,11 };
    int size = sizeof(data) / sizeof(data[0]);

    //InsertionSort(data, size);
    //BubbleSort(data, size);
    SelectioSort(data, size);

    cout << "Sorted Array:" << endl;

    PrintArray(data, size);
}


