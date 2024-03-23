#include <iostream>
#include <stack>

bool isValidMathExpression(const char* expression) {
    std::stack<char> parenthesesStack;
    
    for (int i = 0; expression[i] != '\0'; i++) {        
        char ch = expression[i];

        // Checking open parenthesis
        if (ch == '(') {
            parenthesesStack.push(ch);
        }

        // Checking closing parenthesis
        else if (ch == ')') {
            if (parenthesesStack.empty()) {
                return false;
            }
            parenthesesStack.pop();
        }
    }
    
    // Return false if any unclosed parenthesis
    if (!parenthesesStack.empty()) {
        return false;
    }
    return true;
}

int main() {
    const char* expression1 = "(2 + 3) * 4";
    const char* expression2 = "{2 * 3 * 4}";

    if (isValidMathExpression(expression1)) {
        std::cout << "Valid mathematical expression." << std::endl;
    } else {
        std::cout << "Invalid mathematical expression." << std::endl;
    }
    
    if (isValidMathExpression(expression2)) {
        std::cout<<"Valid mathematical expression."<< std::endl;
    } else {
        std::cout << "Invalid mathematical expression." << std::endl;
    }
    
    return 0;
}
