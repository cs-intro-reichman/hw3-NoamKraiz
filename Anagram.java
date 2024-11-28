/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		// Replace the following statement with your code
		String str3 = preProcess(str1);
		String str4 = preProcess(str2);
		int j=0;
		boolean exist=true;
		for(int i=0; i<str3.length(); i++){
			j=0;
			if(str3.charAt(i) != ' '){
			while (str3.charAt(i) != str4.charAt(j)) {
				j++;
				if (j == str4.length()) exist = false;
			}
			if (!exist) return false;
		}
		}
		return true;
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		// Replace the following statement with your code
		String ans ="";
		char ch = str.charAt(0);
		if (ch >= 'a' && ch <='z')ans = "" + ch;
		else if(ch >= 'A' && ch <= 'Z') 
		{
			ch+=32;
			ans = "" + ch;
		}
		int i=1;
		while (i < str.length()) {
			ch= str.charAt(i);
			if (ch >= 'A' && ch <= 'Z'){
				ch+=32;
				ans = ans + ch;
			}
			else if (ch >= 'a' && ch <='z') ans = ans + ch;
			i++;
		}
		return ans;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		// Replace the following statement with your code
		String str1 = str;
		int num = str1.length()*(int)Math.random()+1;
		String str2 = str1.substring(num,str1.length());
		String str3= str1.substring(0, num);
		String ans = str2 + str3;

		return ans;
		}
		
}

