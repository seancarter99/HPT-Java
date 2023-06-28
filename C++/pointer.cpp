#include <iostream>

// using namespace std; // Frowned upon
// In std, there is a function called sort

int main() {
    // System.out.println("Hello World");
    // cout - Output
    // cin - Input
    std::cout << "Hello World" << std::endl;

    // Pointers
    // Pointers are used to refer to data on the heap
    int x = 10; // This stores the variable x in the stack

    // Using a pointer, I can refer to data on the heap
    int* y = new int; // Created a pointer variable, y, which points some int value on the heap
    // y = 1000; // Change the memory location of where it's pointing
    *y = 1000; // Puts the 1000 in the box in the heap

    // Print y
    std::cout << "The memory address of the pointer: " << y << std::endl;
    std::cout << "The value being pointed to: " << *y << std::endl;

    int* z = y; // Creating a pointer z that points to whatever y is pointing to
    *z = 7;    

    std::cout << "The value being pointed to: " << *y << std::endl;

    // Delete pointers yourself
    // delete z;
    // delete y;

    // Y points to an int in the heap
    // A points to a pointer to an int in the heap
    int** a = new int*;
    a = &y; // a = The memory address of y
    // **a = 1;

   // Return is optional technically (ONLY FOR MAIN)
   // Returns 0 by default
}