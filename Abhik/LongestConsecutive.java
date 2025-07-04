package Abhik;
import java.util.*;
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }int l=1;
        int longest=1;
        for(int i:nums){
            if(!set.contains(i-1)){
                while(set.contains(i+l)){
                    l=l+1;
                }
                longest=Math.max(l, longest);

            }
        }
        return longest;

    }
}
