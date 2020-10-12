import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BuddyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyString obj = new BuddyString();
		System.out.println(obj.buddyStrings("aaaaaaabc", "aaaaaaacb"));
	}

	public boolean buddyStrings(String A, String B) {

		if (A.length() != B.length())
			return false;
		if (A.equals(B)) {
			HashSet<Character> unique_chars = new HashSet();
			for (char c : A.toCharArray()) {
				unique_chars.add(c);
			}

			if (unique_chars.size() < A.length()) {
				return true;
			} else
				return false;
		}
		List<Integer> diff = new ArrayList();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				diff.add(i);
			}
		}

		if (diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1))
				&& A.charAt(diff.get(1)) == B.charAt(diff.get(0))) {
			return true;
		} else
			return false;
	}
}
