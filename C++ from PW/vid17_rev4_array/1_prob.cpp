

#include<iostream>
using namespace std;
int main(){
    int m,n;
    cout<<"Enter size of 1st array: ";
    cin>>m;
    int arr1[m];
    cout<<"Enter 1st array: "<<endl;
    for(int i=0;i<m;i++){
        cin>>arr1[i];
    }
    
    cout<<"enter size of 2nd array: ";
    cin>>n;
    int arr2[n];
    cout<<"Enter 2nd array: "<<endl;
    for(int i=0;i<n;i++){
        cin>>arr2[i];
    }

    int result[m+n];
    int i=0; //will help us to iterate on arr1
    int j=0; // will help us to iterate on arr2
    int k=0;// will help us to iterate on result

while(i<m and j<n){
    // both i and j should be within the limits or arr1 and arr2
    if(arr1[i]<arr2[j]){
        result[k]=arr1[i];
        k++;
        i++;

    }
    else{
        result[k]=arr2[j];
        k++;
        j++;
    }
}
while(i<m){
    //arr2 was exhausted and we still got elements left in arr1
    result[k]=arr1[i];
    i++;
    k++;
}

while(j<n){
    //arr1 was exhausted and we still got elements left in arr2
    result[k]=arr2[j];
    j++;
    k++;
}
    
    for(int i=0;i<m+n;i++){
        cout<<result[i]<<" ";
    }
    
    
    
    return 0;
}