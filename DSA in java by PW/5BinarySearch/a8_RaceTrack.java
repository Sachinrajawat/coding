//Maxima minimum
/*
 * A new racing track for kids is being built in new york with 'n' starting spots. The spots are located along a straight line at
 * positions x1, x2, ..... xn(xi<=10^9). For each 'i', xi+i>xi
 * At a time only 'm' children are allowed to enter the race. Since the race track is for kids, they may run into each other while
 * running. To prevent this, we want to choose the starting spots such that the minimum distance between any two of them is a s large as
 * possible. What is the largest minimum distance?
 * 
 */
public class a8_RaceTrack {
    static boolean isDivisionPossible(int[] a, int k, int dist){
        int kidsPlaced=1;
        int lastKid = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-lastKid >= dist){
                kidsPlaced++;
                lastKid =a[i];
            }
        }
        return kidsPlaced>=k;
    }

    static int raceTrack(int[] a,int k){
        if(k>a.length) return -1;
        int st = 0, end = (int)1e9;
        int ans=0;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(isDivisionPossible(a, k, mid)){// can k kids be placed such that no 2 kids have distance lesser than mid
                ans = mid;
                st = mid+1;
            }else{
                end=mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,8,9}; //location of each spot
        int k=2; //number of children
        System.out.println(raceTrack(a, k));
    }
}
