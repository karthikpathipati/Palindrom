package palindrom;

public class palindrone {
	public static void main (String args[]) {
		String name ="levels";
		boolean palindrome = true;
		int left = 0 ;
		int right = name.length()-1;
		while (left<right) {
			if(name.charAt(left) != name.charAt(right)) {
				palindrome= false;
				break;
			}
			left ++;
			right --;
		}
		if(palindrome) {
		System.out.println(name + "it is a palindrome");
		}else {
		System.out.println(name + "it is not a palindrom");
		}
		
	}

}
