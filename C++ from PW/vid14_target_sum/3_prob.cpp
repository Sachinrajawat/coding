/* Find the unique number in a given array where all the elements are being repeated twice with one value beaing unique

*/

#include <iostream>
using namespace std;
int main()
{
    int arr[7] = {};
    cout << "Enter arr: ";
    for (int i = 0; i < 7; i++)
    {
        cin >> arr[i];
    }
    
    for (int i = 0; i < 7; i++)
    {
        for (int j = i + 1; j < 7; j++)
        {
            if (arr[i] == arr[j])
            {
                arr[i]=arr[j]=-1;
            }
        }
    }
    for(int i=0;i<7;i++){
        if(arr[i]>0){
            cout<<"Ans is "<<arr[i];
        }
    }

    return 0;
}