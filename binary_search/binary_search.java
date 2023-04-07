import java.util.Scanner;

public class binarysearch {
	public static void binarysearch(){
        int lo = 0, hi = a.length-1;
        while(lo <= hi){
            int min = lo + (hi-lo) / 2;
            if(key <a[mid]) hi = mid-1;
            else if(key > a[mid]) lo = mid+1;
            else return mid;
        }
    }	
}
