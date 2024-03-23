//insertion sort

//repetedly take elements from unsorted subarray & insert in sorted subarray
/*
11 | 8 15 9 4
s  un       //s=sorted,un=nnsorted
8 11 | 15 9 4
s    un
8 11 15 | 9 4
sorted    unsorted
8 9 11 15 | 4
sorted     unsorted
4 8 9 11 15 
sorted
*/


//time cmplx = o(n^2)
// space cmplx = o(1)

//best case = o(n^2)
//worst case = omega(n)


/*
application

array is already sorted
*/

//stable sorting algo

#include<iostream>
using namespace std;

void insertionSort(int *arr, int n) {
    for(int i = 1; i < n; i++) {
        int current = arr[i];
        int j = i - 1;
        while(j >= 0 && arr[j] > current) {
            swap(arr[j+1],arr[j]);  
            j--;
        }
        arr[j + 1] = current;
    }
    return;
}

int main() {
    int n = 5;
    int arr[5] = {11, 8, 15, 9, 4};
    insertionSort(arr, n);
    for(int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}