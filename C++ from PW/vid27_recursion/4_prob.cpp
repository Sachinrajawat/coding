

/*
given two numbers p and q, find the value p^q using a recursive function
*/
//time complexity=o(q)
//space complexity=o(q)



/*#include<iostream>
using namespace std;
int f(int p,int q){
    if(q==0) return 1 ;
    return p*f(p,q-1);
}
int main(){
    // int p=2,q=3;
    int result= f(2,6);
    cout<<result;
    return 0;
}*/


//2nd method 

/*
        ---f(p,q/2)  ///q=even
f(p,q)--
        ---p*f(p,q-1/2)    ///q is odd
*/


#include<iostream>
using namespace std;
int f(int p,int q){
    if(q==0) return 1;
    if(q%2==0){
        //if q is even
        int result=f(p,q/2);
        return result*result;
    }
    else{
        int result = f(p,(q-1)/2);
        return p*result*result;
    }
    
    
}
int main(){
    // int p=2,q=3;
    int result= f(2,6);
    cout<<result;
    return 0;}
