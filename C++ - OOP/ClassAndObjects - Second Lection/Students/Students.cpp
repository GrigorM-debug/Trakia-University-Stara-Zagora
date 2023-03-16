// Students.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
using namespace std;

class Student {
public:
	string Name;
	string LastName;
	string Number;
	double Grade;

public:
	Student(string name,string lastname, string number, double grade) {
		Name = name;
		LastName = lastname;
		Number = number;
		Grade = grade;

	}

	string PrintName() {
		return Name + " " + LastName + " " + Number + " ";
	}
	//string PrintLastName() {
	//	return LastName;
	//}
	//string PrintNumber() {
	//	return Number;
	//}
	double PrintGrade() {
		return Grade;
	}
};

int main()
{
	string name, number, lastname;
	cout << "Enter firstname: ";
	cin >> name;
	cout << "Enter lastname: ";
	cin >> lastname;
	cout << "Enter falk number: ";
	cin >> number;
	double grade;
	cout << "Enter grade: ";
	cin >> grade;

	Student student(name,lastname, number, grade);
	
	//cout << student.PrintName() << " " << student.PrintLastName() << " " << student.PrintNumber() << " " << student.PrintGrade();
	cout << student.PrintName() << " " << student.PrintGrade();
}

