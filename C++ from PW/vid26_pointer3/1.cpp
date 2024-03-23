/*
types of pointers
1. Null pointer
2. wild pointer
3. dangling pointer
4. void pointer

*/

/* wild pointer

a wild pointer is a type of a pointer where useer declares
the pointer but not initializes it

->due to this it ends up pointing to some random memory location
*/
/* 
#include<iostream>
using namespace std;
int main(){
    int *ptr;
    cout<<ptr<<" "<<*ptr;
} */


//null pointer 
/* if we want to have a pointer variable, which is just declared but will get addresslater to store.
we can use null pointer */

// int *ptr=NULL;
/* 
#include<iostream>
using namespace std;
int main(){
    int *ptr=NULL;
    int *p1=0;
    int *p2='\0';
    cout<<ptr<<" "<<p1<<" "<<p2<<" "<<endl;
    return 0;
} 

 */


// dangling pointer
/* it is a type of pointer that points to a memory loc that is not valid  */
/* #inlcude<iostream>
using namespace std;

int main(){
    int *ptr=NULL;
    {
        int x=10;
        ptr=&x;
    }
    cout<<ptr;
} */


//void pointer
/* these are speacial pointer that can point to any datatype*/
//void pointer cannot be derefrence
int main(){
    float f=10.2;
    int x=10;
    void *p1=&f;
    p1=&x;

    int *integerPointer=(int*)ptr;
    cout<<*integerPointer<<endl;
    return 0;
}