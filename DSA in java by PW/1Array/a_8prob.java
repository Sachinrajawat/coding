//check if number is present in the array or not

import java.util.Scanner;

public class a_8prob {
static int[] makeFrequencyArray(int[] arr){
    int[] freq=new int[100005];
    for (int i = 0; i < arr.length; i++) {
        freq[arr[i]]++;
    }
    return freq;
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Size of the array: ");
        int size=in.nextInt();
        int[] arr=new int[size];

        System.out.println("enter "+size+" elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        int[] freq=makeFrequencyArray(arr);
        System.out.println("Enter number of queries ");
        int q=in.nextInt();
        while(q>0){
            System.out.println("Enter number to be searched ");
            int x=in.nextInt();
            if(freq[x]>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
    }
}
