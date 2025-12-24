Example of Complete Formatted I/O Operations

  
int main() {
    int number = 45;
    cout << setw(10) << number << endl;  // Right-aligned by default
    cout << setw(10) << setfill('*') << number << endl;  // Left-aligned with '*' 
fill
    cout << "PI: " << fixed << setprecision(3) << 3.14159265 << endl;  // Fixed 
point with 3 decimals
    return 0;
}
makefile
        45
********45
PI: 3.142
cpp
#include <iostream>
#include <iomanip>
using namespace std;
int main() {
    // Unformatted input
    char ch = cin.get();  // Read a single character
    cout.put(ch);  // Output the character
    // Formatted I/O
    double pi = 3.14159265;
    cout << "PI (fixed, 2 decimal places): " << fixed << setprecision(2) << pi << 
endl;
    // Using manipulators
    int x = 10;
    cout << "Number with setw and setfill: " << setw(5) << setfill('*') << x << 
129/160
endl;
return 0;
}
Conclusio
