cpp
#include <iostream>
using namespace std;
115/160
Output:
Key Points:
1. C++ doesn’t have or need an abstract keyword because:
Pure virtual functions automatically enforce the abstract nature of the class.
Abstract behavior is handled entirely by the compiler.
2. You must implement all pure virtual functions in derived classes to make them
instantiable. Otherwise, the derived class itself becomes abstract.
class Shape {
public:
    virtual void draw() = 0;  // Pure virtual function
};
class Circle : public Shape {
public:
    void draw() override {
        cout << "Drawing Circle" << endl;
    }
};
int main() {
    // Shape s;  // Error: Cannot instantiate abstract class
    Circle c;
    c.draw();  // Output: Drawing Circle
    Shape* shape = &c;  // Works via base class pointer
    shape->draw();      // Output: Drawing Circle
    return 0;
}
