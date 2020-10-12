import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/*
 * Question
 * Given a string s, remove duplicate letters so that every letter appears once 
 * and only once. 
 * You must make sure your result is the smallest in lexicographical order 
 * among all possible results.
 */
public class RemoveDuplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateLetters obj = new RemoveDuplicateLetters();
		System.out.println(obj.removeDuplicateLetters("bcabc"));
	}
	
	 public String removeDuplicateLetters(String s) {
	        Map<Character, Integer> map = new HashMap();
	        Set<Character> visited = new HashSet();
	        //take frequency
	        for(char c : s.toCharArray()){
	            map.put(c, map.getOrDefault(c,0)+1);
	        }
	        
	        Stack<Character> st = new Stack();
	        for(char c: s.toCharArray()){
	            map.put(c, map.get(c)-1);
	            if(visited.contains(c)){
	                continue;
	            }
	            while(!st.isEmpty() && c < st.peek() && map.get(st.peek()) != 0){
	                char ch = st.pop();
	                visited.remove(ch);
	            }
	            st.push(c);
	            visited.add(c);
	        }
	        
	        StringBuilder res = new StringBuilder();
	        while(!st.isEmpty()){
	            res.insert(0, st.pop());
	        }
	        
	       return res.toString();
	    }

}
