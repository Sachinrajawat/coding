#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
class Rectangle {
private:
    int sidel;
    int side2;

public:
 
    Rectangle() {
        sidel = 0;
        side2 = 0;
    }

    void setSides(int l, int w) {
        sidel = l;
        side2 = w;
    }

    void calculateArea() {
        int area = sidel * side2;
        cout << area << std::endl;
    }

    void calculatePerimeter() {
        int perimeter = 2 * (sidel + side2);
        cout << perimeter << std::endl;
    }

    void calculateDiagonal() {
        if (sidel % 3 == 0 && side2 % 3 == 0) {
            double diagonal = sqrt(pow(sidel, 2) + pow(side2, 2));
            cout << std::fixed << std::setprecision(2) << diagonal << std::endl;
        } else {
            cout << "There are no diagonals" << std::endl;
        }
    }
};

int main() {

    Rectangle rect;

    int l, w;
    std::cin >> l >> w;

    rect.setSides(l, w);

    rect.calculateArea();

    rect.calculatePerimeter();

    rect.calculateDiagonal();

    return 0;
}