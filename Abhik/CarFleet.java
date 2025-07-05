package Abhik;
import java .util.*;

class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int c=0;
        double ar [][]=new double [position.length][2];
        for(int i=0;i<position.length;i++){
            ar[i][0]=position[i];
            ar[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(ar,(a,b)->Double.compare(b[0], a[0]) );
        double prev=0;
        for(int i=0;i<position.length-1;i++){
            if(ar[i][1]>prev){
                c++;
                prev=ar[i][1];
            }
            
        }
        return c;
    }
}

