 Freeing Memory Allocated to
#include <iostream>
using namespace std;
int main() {
    // Declare an array of two pointers to int
    int *p[2];
    // Dynamically allocate memory for the integers
    p[0] = new int(10);  // Allocate memory and initialize with 10
    p[1] = new int(20);  // Allocate memory and initialize with 20
    cout << "Value of *p[0]: " << *p[0] << endl;  // Outputs 10
    cout << "Value of *p[1]: " << *p[1] << endl;  // Outputs 20
    // Free the memory allocated for each pointer
    delete p[0];
