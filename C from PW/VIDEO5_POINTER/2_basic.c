#include<stdio.h>
// isme hm int main ke upar hi void ko rakhte h 
// jise call krte j wo hmesha upar hi rhta h 
void england(){
    printf("You are in england\n"); // 6th
    return; //7th
}
void australia(){
    printf("You are in Australia\n"); //4th
    england(); // calling england // 5th
    return; // 8th
}
void india(){
    printf("You are in India\n");//2nd step
    australia(); // calling australia // 3rd
    return;// 9th
}
int main(){
    india(); // calling india //1st step
    return 0;//10
}