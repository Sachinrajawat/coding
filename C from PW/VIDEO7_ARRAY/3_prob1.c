// if marks of student less than 35 print its roll(index)
#include<stdio.h>

int main(){
    int marks[10] = {34,56,77,85,22,95,42,55,87,41};
    for(int i=0;i<=4;i++){
        if(marks[i]<35){
            printf("%d ",i);
        }
    }
    
    return 0;
}