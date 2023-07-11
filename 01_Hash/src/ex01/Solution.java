package ex01;




//participant	                                         completion	
//["leo", "kiki", "eden"]	                               ["eden", "kiki"]	"leo"
//["marina", "josipa", "nikola", "vinko", "filipa"]	     ["josipa", "filipa", "marina", "nikola"]	"vinko"
//["mislav", "stanko", "mislav", "ana"]	                 ["stanko", "ana", "mislav"]	"mislav"
import java.util.*;

class Solution {
	public String solution(String[]participant, String[]completion) {
		String answer ="";
		HashMap<String, Integer>hm = new HashMap<>();
		for(String player: participant)hm.put(player, hm.getOrDefault(player, 0)+1);
		for(String player: completion)hm.put(player, hm.get(player)-1);
		
		for(String key : hm.keySet()) {
			if(hm.get(key)!=0) {
				answer = key;
			}
				
		
		}
		return answer;
	}
	
		
		
			public static void main(String[] args) {
				String[]participant = {"mislav", "stanko", "mislav", "ana"};	
				String[]completion 	= {"stanko", "ana", "mislav"};
				String result = new Solution().solution(participant, completion);
				System.out.println(result);
				
	}
}
 