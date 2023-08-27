import java.util.regex.*;

public class RegEx {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("Shubham");
		Matcher m=p.matcher("Shubhai");
		boolean bt=m.matches();
		if(bt) {
			System.out.println("match found");
		}
		else {
			System.out.println("no match found");
		}
	}
}
