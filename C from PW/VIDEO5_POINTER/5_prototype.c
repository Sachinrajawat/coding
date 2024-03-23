#include<stdio.h>
// isme void ko int main ke upar ya neeche kho bhi rakkh skte h 
int main(){
    void fun();
    fun();
    return 0;
}
void fun(){
    printf("Hello");
}