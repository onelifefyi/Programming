#include <iostream>

int main(){
	std::cout << "Enter your full name: ";
	std::string name{};
	std::getline(std::cin >> std::ws, name);

	int age{};
	std::cout << "Enter your age: ";
	std::cin >> age;
	
	std::cout << "Your age + length of name is: " << age + name.length();
	return 0;
}
