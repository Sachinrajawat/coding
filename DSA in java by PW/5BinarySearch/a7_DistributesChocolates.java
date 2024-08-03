//Minimum Maxima
/*
 * You have 'n'(n<=10^5) boxes of chocolate. Each box contains a[i](a[i] <= 10000) chocolates. You need to distributes these boxes among
 *  'm' students such that the maximum number of chocolates allocated to a student is minimum.
 *  a) One box will be allocated to exactly oen student
 *  b) all the boxes should be allocated
 *  c) Each Student has to be allocated at least one box
 *  d) Allotment should be in contiguous order, for instance, a student cannot be allocated box 1 and box 3, skipping box 2
 * calculate and return that minimum possible number. 
 */
public class a7_DistributesChocolates {
    static boolean isDivisionPossible(int[] a,int m, int mxChocAllowed){
        int numOfStudents=1;
        int choc=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>mxChocAllowed) return false;
            if(choc+a[i]<=mxChocAllowed){
                choc += a[i];
            }
            else{
                numOfStudents++;
                choc = a[i];
            }
        }
        if(numOfStudents>m) return false;
        return true;
    }
    static int distributeChocolates(int[] a, int m){
        if(a.length < m) return -1;
        int ans = 0,st=1, end = (int)1e9;

        while(st <= end){
            int mid=st + (end-st)/2;
            if(isDivisionPossible(a, m, mid)){
                ans = mid;
                end=mid-1;
            }
            else{
                st= mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[] a= {5, 3, 1, 4, 2}; //ans =6
        int[] a = {12, 34, 67, 90};  //number of chocolates in each box
        int m=2;  //number of students
        System.out.println(distributeChocolates(a,m));
    }
}
