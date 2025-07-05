package Abhik;
import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int l =0;
        int r =heights.length-1;
        int area=0;
        while(l<r) {
            int a=(r-l)*Math.min(heights[r], heights[l]);
            if(area<a){
                area=a;
            }
            if(heights[l]>=heights[r]){
                r--;
            }
            else{
                l++;
            }
        } 
        return area;
    }
}