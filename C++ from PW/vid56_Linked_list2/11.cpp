#include <iostream>

class NumberReverse {
public:
    int reverse(int n) {
        int reversed = 0;

     
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }
};

int main() {
   
    int N;
    
    std::cin >> N;

    NumberReverse numberReverser;

    int reversedNumber = numberReverser.reverse(N);
    std::cout <<  reversedNumber << std::endl;

    return 0;
}
