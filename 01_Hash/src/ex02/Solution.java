package ex02;
//nums	result
//[3,1,2,3]	2
//[3,3,3,2,2,4]	3
//[3,3,3,2,2,2]	2
import java.util.*;
import java.util.stream.Collectors;




class Solution {
    public int solution(int[] nums) {
       return Arrays.stream(nums)
    		   .boxed()
    		   .collect(Collectors.collectingAndThen(Collectors.toSet(),
    				   phonekemons -> Integer.min(phonekemons.size(), nums.length / 2))); 
    }

    public static void main(String[] args) {
		
		int[]nums 	= {3,1,2,3};
		int result = new Solution().solution(nums);
		System.out.println(result);
		
}
}