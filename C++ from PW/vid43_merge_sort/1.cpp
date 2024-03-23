//merge sort  =  

/*
a=|2|4|7|9|       b=|1|3|5|8|   // both are sorted array

final |1|2|3|4|5|7|8|9|*/

/*
|1|2|4|6|3|8|1|7|
|1|2|4|6|         |3|8|1|7|
  /    \             /   \
|1|2|  |4|6|      |3|8|  |1|7|
/  \     /  \       /\     /  \
|1|  |2| |4| |6|   |3| |8| |1| |7|   //single array is already sorted
\   /    \   /      \  /   \  /
|2|9|    |4|6|     |3|8|   |1|7|
  \     /            \     /
|2|4|6|9|           |1|3|7|8|
        \         /
    |1|2|3|4|6|7|8|9|
Divide and conquer
1. divide problem into subproblems
2.conquer(solve) the subproblems
3. combine solutions to set final output
*/

// time compx = nlogn
#include<iostream>
using namespace std;
void merge(int arr[],int l, int mid,int r){
  int an=mid - l +1;
  int bn=r-mid;
  //create two temp arr
  int a[an];
  int b[bn];
  for(int i=0;i<an;i++){
    a[i]=arr[l+i];
  }
  for(int j=0;j<bn;j++){
    b[j]=arr[mid+1+j];
  }
  int i=0,j=0,k=l;
  while(i<an && j<bn){
    if(a[i]<b[j]){
      arr[k++]=a[i++];
    }
    else{
      arr[k++]=b[j++];
    }
  }
  while(i<an){
    arr[k++]=a[i++];

  }
  while(j<bn){
    arr[k++]=b[j++];
  }
}
void mergeSort(int arr[],int l,int r){
  //v=base case
  if(l>=r){
    return;
  }
  int mid=(l+r)/2;
  mergeSort(arr,l,mid);
  mergeSort(arr,mid+1,r);
  merge(arr,l,mid,r);

}
int main(){
  int n=7;
  int arr[n]={1,2,4,6,3,8,7};
  // int mid=n/2;
  mergeSort(arr,0,n-1);
  for(int i=0;i<n;i++){
    cout<<arr[i]<<" ";
  }
  cout<<endl;
  return 0;
}