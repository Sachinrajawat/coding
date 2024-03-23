//INBUILT FUNC.



#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

/*//REVERSE = reverse a string from starting ptr to end ptr
reverse(ptr1,ptr2)
string str = "abcd";
reverse(str.begin(),str.end());   
output:  dcba

time complxty = O(length of string)*/
/*
int main(){
    string str = "abcd";
    reverse(str.begin(),str.end());
    cout<<str<<endl;
}*/

/*
substr() = to find substring of a given string
"hello" substring "hel"

s.substr(position,length)

//time cmplx = O(length)
*/
/*
int main(){
    string str = "survive";
    cout<<str.substr(1,4)<<endl;
    cout<<str.substr(1)<<endl;  //first se end tk
    return 0;
}*/

/*
 + OPERATOR

s1 = "college";
s2 = "wallah";
s1 = s1 + s2;
 output: collegewallah
*/


/*
strcat() = concatinate character array

char s1[20] = "college";
char s2[20] = "wallah";
strcat(s1,s2);
cout<<s1<<endl;

output: collegewallah
*/

/*
pushback = insert char at the end of string
str.push_back(char);
 //code
string s1 = "abcd";
char ch = 'e';

s1.pushback(ch);
cout<<s1;

output: abcde
*/


/*
str.size();
str.length();

char ch[20] ="abcde";
strlen(ch); //for length of char arr

*/

/*
to_string() = to convert numeric/int value to string

int num = 4;
to_string(num);    --"4"

*/