//QUICK SORT
/*
|10|3|7|9|1|(8)|  //8 ko choose kiya or usko uski correct position pr le gye //LAST ELEMENT IS PIVOT(this is our choice)
|3|7|(1)| 8 |10|(9)|  //hm last element ko select kr rhe h wo hmari marzi h koi bhi select kr skte h
|1| 3|7 | 8 |9|10|
|1|3|7|8|9|10|
*/

//

/*Divide and conquer
1. divide problem into subproblems
2.conquer(solve) the subproblems
3. combine solutions to set final output
*/

// time cmplxty 
//worst case = 0(n^2)
//best case = n(log(n))

// space cmplxty =0(n)

//not stable sorting algo
//application  == memory sorting algo
                // inbuilt sorting algo 
#include<iostream>
using namespace std;
int partition(int arr[],int first,int last){
    int pivot =arr[last];
    int i=first-1;  //for inserting elements <pivot
    for(int j=first;j<last;j++){
        if(arr[j]<pivot){
            i++;
            swap(arr[i],arr[j]);
        }
    }
    swap(arr[i+1],arr[last]);
    return i+1;
}
void quickSort(int arr[],int first,int last){
    if(first>=last) return;  //base case
    
    //recursive case
    int pi = partition(arr,first,last);
    quickSort(arr,first,pi-1);
    quickSort(arr,pi+1,last);
    return;
}
int main(){
    int n=6;
    int arr[n]={10,3,7,9,1,8};
    quickSort(arr,0,n-1);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }cout<<endl;
    return 0;
}
